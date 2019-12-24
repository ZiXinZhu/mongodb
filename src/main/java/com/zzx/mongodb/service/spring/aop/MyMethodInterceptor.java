package com.zzx.mongodb.service.spring.aop;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before method intercept");
        Object result = invocation.proceed();
        System.out.println("after method intercept");
        return result;
    }
}
