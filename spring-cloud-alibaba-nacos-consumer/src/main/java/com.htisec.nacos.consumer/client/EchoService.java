package com.htisec.nacos.consumer.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = EchoFallBackService.class)
public interface EchoService {

    @GetMapping("/echo/{name}")
    String  echoHello (@PathVariable(name = "name") String name);
}
