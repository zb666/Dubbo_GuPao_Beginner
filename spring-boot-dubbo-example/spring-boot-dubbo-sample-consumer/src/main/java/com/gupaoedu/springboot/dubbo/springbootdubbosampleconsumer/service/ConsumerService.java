package com.gupaoedu.springboot.dubbo.springbootdubbosampleconsumer.service;

import com.gupaoedu.springboot.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "2.0.0",cluster = "",retries = 2)
public class ConsumerService implements ISayHelloService {
    @Override
    public String sayHello(String msg) {
        return "Hello Msg: "+msg;
    }
}
