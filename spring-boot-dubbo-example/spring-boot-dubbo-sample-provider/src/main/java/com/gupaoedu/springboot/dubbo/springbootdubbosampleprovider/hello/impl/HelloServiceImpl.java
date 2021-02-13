package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.hello.impl;

import com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.hello.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello Service "+ name);
    }
}
