/**
 * @(#) AopTest.java 2016/12/12
 * Copyright 2016 Snow.com, Inc. All rights reserved.
 */
package com.snow.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hzwanghuiqi
 * @version 2016/12/12
 */
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aoptest-application-context.xml");
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        System.out.println("--------------------------------");
        helloWorldService.sayHello("hello world");
        System.out.println("--------------------------------");
        helloWorldService.sayHello("hia hia");
        System.out.println("--------------------------------");
    }

}
