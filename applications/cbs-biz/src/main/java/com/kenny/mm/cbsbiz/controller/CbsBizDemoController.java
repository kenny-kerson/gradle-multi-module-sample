package com.kenny.mm.cbsbiz.controller;

import com.kenny.mm.domainrabbitmq.producer.CustomMessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CbsBizDemoController {

    private final CustomMessageProducer customMessageProducer;

    public CbsBizDemoController(CustomMessageProducer customMessageProducer) {
        this.customMessageProducer = customMessageProducer;
    }

    @GetMapping("/cbs-biz/demo")
    public String cbsBizDemo() {
        return "cbsBizDemo";
    }

    @GetMapping("/cbs-biz/queue")
    public void cbsBizQueue() {
        customMessageProducer.convertAndSend();
    }
}
