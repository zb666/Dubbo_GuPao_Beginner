package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.services;


import com.gupaoedu.springboot.dubbo.ISayHelloService;
import com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.BobDemo;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.context.annotation.Bean;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

@DubboService(registry = {"shanghai","hunan"},version = "1.0")
public class SayHelloServiceImpl implements ISayHelloService {

    @Override
    public String sayHello(String msg) {
        return "[version1.0]Hello,"+msg+" GuPaoEdu.cn";
    }

    @Bean
    public BobDemo getDemo(){
        return new BobDemo();
    }
}
