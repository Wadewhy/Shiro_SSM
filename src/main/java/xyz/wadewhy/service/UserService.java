/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午9:29:34 
 */
package xyz.wadewhy.service;

import xyz.wadewhy.domain.User;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午9:29:34
* 类说明
*/
/** 
* @ClassName: UserService 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午9:29:34  
*/
public interface UserService {
    User queryUserByUserName(String username);

}
