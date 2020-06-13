package com.kenny.mm.cbsbiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CbsBizDemoController {

    @GetMapping("/cbs-biz/demo")
    public String cbsBizDemo() {
        return "cbsBizDemo";
    }
}
