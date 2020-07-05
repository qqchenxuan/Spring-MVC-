package com.spring.controller;

import com.spring.dao.GoodsMapper;
import com.spring.impl.GoodsMapperImpl;
import com.spring.pojo.Goods;
import com.sun.tools.javac.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import sun.security.util.IOUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class InsertGoods implements Controller {
//    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//        BufferedReader reader=new BufferedReader(new InputStreamReader(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse));
//        String body= IOUtils.read(reader);
//        String name=httpSrevletRequest.getParameter("name");
//        if(StringUtils.isNoBlank(body)){
//            System.out.println("business receive somthing with body:"+body);
//        }




        String param=httpServletRequest.getParameter("param");

        Map<String,Object> map=new HashMap<String, Object>();

        ObjectMapper objectMapper=new ObjectMapper();

        map=objectMapper.readValue(param,new TypeRefence<Map<String,Object>>(){})

        String name=map.get("name").toString();
        Integer price=Integer.parseInt(map.get("price").toString());
        String dt=map.get("dt").toString();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        Date date=simpleDateFormat.parse(dt);
        String remark=map.get("remark").toString();


        System.out.println(name);

        Goods goods=new Goods(1,name,price,date,remark);

        GoodsMapper goodsMapper=new GoodsMapperImpl();
        goodsMapper.insert(goods);

        return null;
    }


}
