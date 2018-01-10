/**
 * @(#) HelloWorldAspect.java 2016/12/12
 * Copyright 2016 Snow.com, Inc. All rights reserved.
 */
package com.snow.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author hzwanghuiqi
 * @version 2016/12/12
 */
@Component(value = "helloWorldAspect")
public class HelloWorldAspect {
    public void beforeHello() {
        System.out.println("before advice");
    }

    public void afterHello() {
        System.out.println("after advice");
    }

    public void aroundHello(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
        // 可以替换掉调用时传递的参数
        Object retVal = pjp.proceed(new Object[] {"around hello"});
        System.out.println("around after advice");
    }


}
