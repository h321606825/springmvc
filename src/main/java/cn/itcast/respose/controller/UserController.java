package cn.itcast.respose.controller;

import cn.itcast.controller.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(){
        System.out.println("testString执行了...");
        return "response";
    }

    /**
     * 请求转发一次请求，
     * @param request
     * @param response
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response){
        System.out.println("testVoid执行了...");
        try {
            //   "/WEB-INF/pages/response.jsp"这个是跟目录路径
            //  "WEB-INF/pages/response.jsp" 这个是user/WEB-INF/pages/response.jsp这个路径
            //1. 请求转发
//            request.getRequestDispatcher("/WEB-INF/pages/response.jsp").forward(request,response);
            //2. 重定向 注意是/index.jsp
            //response.sendRedirect(request.getContextPath()+"/index.jsp");
            //3. 直接进行响应

            //设置中文乱码
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");

            response.getWriter().println("你好");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        //创建对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView 执行了...");
        //模拟从数据库中获取对象
        User user = new User();
        user.setDate(new Date());
        user.setUname("hello");
        user.setAge(22);

        mv.addObject("user",user);
        mv.setViewName("success");//跳到视图解析器下的success.jsp 文件
        return mv;
    }

    @RequestMapping("/testForward")
    public String testForward(){
        System.out.println("testForward 执行了...");
        //请求转发
//        return "forward:/WEB-INF/pages/success.jsp";
        //重定向
        return "redirect:/index.jsp";
    }
}
