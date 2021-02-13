package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider;

import com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.hello.HelloService;
import com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.protocal.MyProtocal;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

public class AppSpi {
    public static void main(String[] args) {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        // 通过指定扩展类名称y ，获取对应实例化对象
        // 这里 extensionLoader 可以把它当作一个 map
        // 如果参数为 ”true“，会加载默认的扩展类
        HelloService helloService = extensionLoader.getExtension("helloService");
        helloService.sayHello("xiaoming");
    }
}
