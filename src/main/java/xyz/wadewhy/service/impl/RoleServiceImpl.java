/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service.impl 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午9:30:04 
 */
package xyz.wadewhy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.wadewhy.domain.Role;
import xyz.wadewhy.mapper.RoleMapper;
import xyz.wadewhy.service.RoleService;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午9:30:04
* 类说明
*/
/** 
* @ClassName: RoleServiceImpl 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午9:30:04  
*/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /* (non-Javadoc)
     * @see xyz.wadewhy.service.RoleService#queryRolesByUserId(java.lang.Integer)
     */
    public List<String> queryRolesByUserId(Integer userId) {
        List<Role> list = roleMapper.queryRolesByUserId(userId);
        List<String> rolesList = new ArrayList<String>();
        for (Role role : list) {
            // 得到角色名称
            rolesList.add(role.getRolename());
        }
        return rolesList;
    }

}
