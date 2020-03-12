/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.vo 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午8:59:36 
 */
package xyz.wadewhy.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.wadewhy.domain.User;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午8:59:36
* 类说明
*/
/** 
* @ClassName: UserVo 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午8:59:36
* vo类  
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    private User user;
    // 用于保存用户角色
    private List<String> rolesList;
    // 用于保存角色的权限
    private List<String> permissions;


}
