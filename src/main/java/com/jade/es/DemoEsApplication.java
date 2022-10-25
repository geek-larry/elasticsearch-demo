package com.jade.es;

import cn.easyes.starter.register.EsMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EsMapperScan("com.jade.es.mapper")
@SpringBootApplication
public class DemoEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEsApplication.class, args);
    }

}
