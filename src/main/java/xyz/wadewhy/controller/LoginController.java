/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.controller 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年3月11日 下午9:05:32 
 */
package xyz.wadewhy.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.wadewhy.vo.UserVo;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年3月11日 下午9:05:32
* 类说明
*/
/** 
* @ClassName: LoginController 
* @Description: TODO
* @author: wadewhy
* @date: 2020年3月11日 下午9:05:32  
*/

@RequestMapping("/login")
@Controller
public class LoginController {
    /**
     * 跳转登录
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "login";
    }

    /**
     * 登录逻辑
     * @param username
     * @param pwd
     * @param session
     * @return
     */
    @RequestMapping("login")
    public String login(String username, String pwd, HttpSession session) {

        // 得到主体
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);
        try {
            // 身份验证和授权
            subject.login(token);
            System.err.println("登录成功");
            // 得到验证成功后的用户，并且携带角色和权限
            UserVo userVo = (UserVo) subject.getPrincipal();
            // session中放user对象
            session.setAttribute("user", userVo.getUser());
            // 重定向
            return "redirect:/user/toUserManager.action";
        } catch (AuthenticationException e) {
            // 验证出错
            System.err.println("出错");
            return "redirect:/index.jsp";
        }

    }
}
