package com.imooc.girl.controller;

import com.imooc.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"hello","hi"})
//RequestMapping可以用于指定整个类的接口，也可以用于指定某个方法的接口
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value="/say", method = RequestMethod.GET)
    public String say(){

        //return "Hello Spring Boot!";
        return girlProperties.getCupSize();
    }
}
