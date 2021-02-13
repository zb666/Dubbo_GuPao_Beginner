package com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider;

import com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider.Contrller.DemoHelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCloudDubboSampleProviderApplicationTests {

    @Autowired
    private DemoHelloController demoHelloController;

    @Test
    void contextLoads() {
        demoHelloController.sayHello();
    }

}
