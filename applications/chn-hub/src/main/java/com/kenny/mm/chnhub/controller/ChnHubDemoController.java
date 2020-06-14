package com.kenny.mm.chnhub.controller;

import com.kenny.mm.feignclient.FeignDemoInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChnHubDemoController {

    private final FeignDemoInterface feignDemoInterface;

    public ChnHubDemoController(FeignDemoInterface feignDemoInterface) {
        this.feignDemoInterface = feignDemoInterface;
    }

    @GetMapping("/chn-hub/demo")
    public String chnHubDemo() {
        return feignDemoInterface.cbsBizDemo();
    }

    @GetMapping("/chn-hub/queue")
    public void chnHubQueue() {
        feignDemoInterface.cbsBizQueue();
    }
}
