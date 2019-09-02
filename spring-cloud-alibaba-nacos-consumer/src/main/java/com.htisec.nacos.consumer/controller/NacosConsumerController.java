package com.htisec.nacos.consumer.controller;

import com.htisec.nacos.consumer.client.EchoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConsumerController {


    @Autowired
    private EchoService echoService;

    @GetMapping("/echo/{name}")
    public String echoHello (@PathVariable(name = "name")String name){
        return echoService.echoHello(name);
    }
}
