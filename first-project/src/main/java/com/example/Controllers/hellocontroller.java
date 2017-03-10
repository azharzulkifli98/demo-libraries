package com.example.Controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by azhar on 3/6/2017.
 */
@Controller
public class hellocontroller {

    @RequestMapping(value="")
    @ResponseBody
    public String index(HttpServletRequest request){
        String name = request.getParameter("name");
        return "Hello, World" + name;
    }

    /*@RequestMapping(value="hello")
    *@ResponseBody
    *public String greeting {
    *    return "response";
    */

}
