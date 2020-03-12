/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service.impl 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午9:30:12 
 */
package xyz.wadewhy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.wadewhy.domain.User;
import xyz.wadewhy.mapper.UserMapper;
import xyz.wadewhy.service.UserService;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午9:30:12
* 类说明
*/
/** 
* @ClassName: UserServiceImpl 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午9:30:12  
*/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /* (non-Javadoc)
     * @see xyz.wadewhy.service.UserService#queryUserByUsername(java.lang.String)
     */
    public User queryUserByUserName(String username) {

        return userMapper.queryUserByUserName(username);
    }

}
