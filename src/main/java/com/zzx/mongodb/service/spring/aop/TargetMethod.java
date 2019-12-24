package com.zzx.mongodb.service.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class TargetMethod {

    public String methodIntercept() {
        String s = "method intercept";
        System.out.println(s);
        System.out.println(this.getClass().toString());
        return s;
    }
}
