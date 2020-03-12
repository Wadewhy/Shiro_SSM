/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.controller 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午10:42:31 
 */
package xyz.wadewhy.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午10:42:31
* 类说明
*/
/** 
* @ClassName: UserController 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午10:42:31  
*/
@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 跳转到用户管理的页面
     */
    @RequestMapping("toUserManager")
    public String toUserManager() {
        return "list";
    }

    @RequiresPermissions("user:query")
    @RequestMapping("query")
    @ResponseBody
    public Map<String, Object> query() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "query");
        return map;
    }

    @RequiresPermissions("user:add")
    @RequestMapping("add")
    @ResponseBody
    public Map<String, Object> add() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "add");
        return map;
    }

    @RequiresPermissions("user:update")
    @RequestMapping("update")
    @ResponseBody
    public Map<String, Object> update() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "update");
        return map;
    }

    @RequiresPermissions("user:delete")
    @RequestMapping("delete")
    @ResponseBody
    public Map<String, Object> delete() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "delete");
        return map;
    }

    @RequiresPermissions("user:export")
    @RequestMapping("export")
    @ResponseBody
    public Map<String, Object> export() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "export");
        return map;
    }
}
