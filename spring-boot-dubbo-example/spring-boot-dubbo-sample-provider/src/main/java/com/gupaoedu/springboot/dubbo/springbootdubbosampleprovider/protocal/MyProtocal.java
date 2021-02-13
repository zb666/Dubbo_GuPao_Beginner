package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.protocal;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.*;

import java.util.List;

public class MyProtocal implements Protocol {
    @Override
    public int getDefaultPort() {
        return 8888;
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        return null;
    }

    @Override
    public <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException {
        return null;
    }

    @Override
    public void destroy() {

    }

    @Override
    public List<ProtocolServer> getServers() {
        return null;
    }
}
