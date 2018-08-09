package com.imooc.girl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {

    @Before("execution(public * com.imooc.girl.controller.GirlController.girlList(..))")
    public void log(){
        System.out.print(111111);
    }
}
