package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.hello;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface HelloService {
    void sayHello(String name);
}
