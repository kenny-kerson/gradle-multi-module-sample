package com.kenny.mm.chnhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kenny.mm")
public class ChnHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChnHubApplication.class, args);
    }

}
