package com.zzx.mongodb.service.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut(value = "execution(public * com.zzx.mongodb.service.spring.aop.TargetService.*(..))")
    public void testPointCut(){}


    @Before(value = "testPointCut()")
    public void beforeAction(JoinPoint joinPoint){
        System.out.println("before");
    }


    @After(value = "testPointCut()")
    public void afterAction(JoinPoint joinPoint){
        System.out.println("after");
    }


    @AfterReturning(value = "testPointCut()", returning = "ret")
    public void afterReturningAction(Object ret){
        System.out.println("already return");
        ret = "shit!";
    }


    @Around(value = "testPointCut()")
    public void aroundAction(ProceedingJoinPoint pjp){
        System.out.println("around before");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after");
    }
}
