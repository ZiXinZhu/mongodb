package com.zzx.mongodb.service.spring;

import com.zzx.mongodb.service.spring.factorybean.IBeanInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class FactoryBeanDemoTest {

    @Autowired
    private IBeanInterface bean;


    @Test
    public void testBeanFactory(){
        String s = bean.service();
        System.out.println(s);
    }
}