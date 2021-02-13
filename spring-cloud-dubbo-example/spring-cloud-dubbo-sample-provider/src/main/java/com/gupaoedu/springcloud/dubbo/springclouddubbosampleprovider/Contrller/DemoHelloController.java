package com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider.Contrller;

import com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider.services.SayHelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/demo")
public class DemoHelloController {

    @Autowired
    private SayHelloServiceImpl sayHelloService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return sayHelloService.sayHello("Bob");
    }

}
