/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午9:29:44 
 */
package xyz.wadewhy.service;

import java.util.List;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午9:29:44
* 类说明
*/
/** 
* @ClassName: RoleService 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午9:29:44  
*/
public interface RoleService {

    /**
     * 根据用户ID查询用户角色
     */
    List<String> queryRolesByUserId(Integer userId);
}
