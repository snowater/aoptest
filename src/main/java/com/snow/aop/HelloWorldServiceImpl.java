/**
 * @(#) HelloWorldServiceImpl.java 2016/12/12
 * Copyright 2016 Snow.com, Inc. All rights reserved.
 */
package com.snow.aop;

import org.springframework.stereotype.Service;

/**
 * @author hzwanghuiqi
 * @version 2016/12/12
 */
@Service(value = "helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService{

    @Override
    public void sayHello(String str) {
        System.out.println(str);
    }
}