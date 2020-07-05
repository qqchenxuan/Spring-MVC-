package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

public class InsertUser implements Controller {
    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception{
        String name=arg0.getParameter("name");
        System.out.println(name);
        return null;
    }

}
