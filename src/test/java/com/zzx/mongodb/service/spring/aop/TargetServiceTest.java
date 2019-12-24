package com.zzx.mongodb.service.spring.aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TargetServiceTest {
    @Autowired
    private TargetService service;


    @Test
    public void testAOP(){
        System.out.println(service.service());
    }
}