package com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.logging.Logger;

public class BobDemo implements InitializingBean, DisposableBean {
    private Logger logger = Logger.getLogger(BobDemo.class.getName());

    @Override
    public void destroy() throws Exception {
        logger.info("Destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("afterPropertiesSet");
    }
}
