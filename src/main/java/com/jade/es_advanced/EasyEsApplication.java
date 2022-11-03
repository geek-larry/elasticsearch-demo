package com.jade.es_advanced;

import cn.easyes.starter.register.EsMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * <p>
 * 
 **/
@SpringBootApplication
@EsMapperScan("com.jade.es_advanced.mapper")
public class EasyEsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyEsApplication.class, args);
    }
}
