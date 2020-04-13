package com.lottoatm.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AtmApplication {

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
    public static void main(String[] args) {
        SpringApplication.run(AtmApplication.class, args);
    }

}
