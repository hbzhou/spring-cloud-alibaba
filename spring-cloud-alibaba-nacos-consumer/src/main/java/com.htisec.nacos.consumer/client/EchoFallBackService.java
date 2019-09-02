package com.htisec.nacos.consumer.client;

import org.springframework.stereotype.Component;

@Component
public class EchoFallBackService implements EchoService {


    @Override
    public String echoHello(String name) {
        return "Hello, This is Fall Back!!"+name;
    }
}
