package cn.itcast.controller.controller;

import cn.itcast.controller.domain.Account;
import cn.itcast.controller.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数绑定入门
 * 1. testParam(String username,String password)
 * 2. 请求参数绑定把数据封装到JavaBean的类中
 * 3. list
 */
@Controller
@RequestMapping(value = "/params")
public class ParamsController {
    /***
     * 请求参数绑定
     *
     *
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("testParams ...");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("/saveParam")
    public String saveParam(Account account){
        System.out.println("saveParam执行了...");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转化
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("saveParam执行了...");
        System.out.println(user);
        return "success";
    }

    /**
     * 原生API
     * @return
     */
    @RequestMapping("testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("testServlet执行了...");
        System.out.println(request);
        HttpSession session =request.getSession();
        System.out.println(session);
        ServletContext context = session.getServletContext();
        System.out.println(context);
        System.out.println(response);
        return "success";
    }
}
