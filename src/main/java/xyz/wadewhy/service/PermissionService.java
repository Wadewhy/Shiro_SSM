/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午9:28:55 
 */
package xyz.wadewhy.service;

import java.util.List;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午9:28:55
* 类说明
*/
/** 
* @ClassName: PersionService 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午9:28:55  
*/
public interface PermissionService {
    /**
     * 根据用户ID查询权限
     */
    List<String> queryPermissionByUserId(Integer userId);
}
