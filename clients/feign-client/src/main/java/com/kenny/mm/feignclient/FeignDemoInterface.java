package com.kenny.mm.feignclient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( name = "cbs-biz", url = "http://localhost:8091" )
public interface FeignDemoInterface {

    @GetMapping("/cbs-biz/demo")
    String cbsBizDemo();
}
