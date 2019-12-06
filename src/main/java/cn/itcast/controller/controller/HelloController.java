package cn.itcast.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String Sayhello()
    {
        System.out.println("Hello SpringMVC");
        return "success";//默认去找success.jsp
    }

    @RequestMapping(value = "testRequestMapping",method = RequestMethod.GET,params = {"username"})
    public String testRequestMapping(){
        System.out.println("测试RequstMapping ...");
        return "sucessRequestMapping";
    }
}
