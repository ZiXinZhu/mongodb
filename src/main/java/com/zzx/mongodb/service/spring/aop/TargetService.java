package com.zzx.mongodb.service.spring.aop;


import org.springframework.stereotype.Component;

@Component
public class TargetService {
    public TargetService(){
        System.out.println("initialing...");
    }

    public String service(){
        String s = "this is original output";
        System.out.println(s);
        return s;
    }
}
