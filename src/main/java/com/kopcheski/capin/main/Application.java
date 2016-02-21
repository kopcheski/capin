package com.kopcheski.capin.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kopcheski.capin.service.CapinService;

//@SpringBootApplication
public class Application {
    
    private CapinService service = new CapinService();

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Application.class, args);
        new Application().service.importe();
    }
}
