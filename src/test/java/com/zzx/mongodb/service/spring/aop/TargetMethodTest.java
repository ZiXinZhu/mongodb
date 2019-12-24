package com.zzx.mongodb.service.spring.aop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TargetMethodTest {

    @Autowired
    private TargetMethod targetMethod;

    @Test
    public void testMethodInterceptor(){
        String result = targetMethod.methodIntercept();
        System.out.println(result);
    }

}