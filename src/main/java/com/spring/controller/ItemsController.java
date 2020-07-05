package com.spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.pojo.Items;

public class ItemsController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// 使用静态数据来模拟jsp页面中的数据
		List<Items> itemsList = new ArrayList<Items>();
		Items items1 = new Items();
		 items1.setName("联想笔记本");
		 items1.setPrice(6000f);
		 items1.setDetail("ThinkPad T430 联想笔记本电脑 ");
		 items1.setCreatetimes(new Date());
		 
			Items items2 = new Items();
			 items2.setName("苹果手机");
			 items2.setPrice(5000f);
			 items2.setDetail("iphone6苹果手机 ");
			 items2.setCreatetimes(new Date());
			 
			 itemsList.add(items1);
			 itemsList.add(items2);
			 
			 ModelAndView mv= new ModelAndView();
			 mv.addObject("itemsList", itemsList);
			 //指定要跳转的jsp页面
			 mv.setViewName("/WEB-INF/itemsList.jsp");
		    return mv;
	}

}
