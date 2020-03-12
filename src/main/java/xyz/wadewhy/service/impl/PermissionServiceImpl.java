/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service.impl 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午9:28:26 
 */
package xyz.wadewhy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.wadewhy.domain.Permission;
import xyz.wadewhy.mapper.PermissionMapper;
import xyz.wadewhy.service.PermissionService;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午9:28:26
* 类说明
*/
/** 
* @ClassName: PermissionServiceImpl 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午9:28:26  
*/
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    // 根据userid查询权限权限，多表关联
    public List<String> queryPermissionByUserId(Integer userId) {
        List<Permission> list = permissionMapper.queryPermissionByUserId(userId);
        List<String> permissions = new ArrayList<String>();
        for (Permission permission : list) {
            permissions.add(permission.getPercode());
        }
        return permissions;
    }

}
