package com.zzx.mongodb.service.spring.aop;



import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.aopalliance.intercept.MethodInterceptor;

@Configuration
public class AOPConfig {

    @Bean
    public DefaultPointcutAdvisor pointcutAdvisor(){
        MethodInterceptor interceptor = new MyMethodInterceptor();
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(public * com.zzx.mongodb.service.spring.aop.TargetMethod.*(..))");
        DefaultPointcutAdvisor pointcutAdvisor = new DefaultPointcutAdvisor();
        pointcutAdvisor.setPointcut(pointcut);
        pointcutAdvisor.setAdvice(interceptor);

        return pointcutAdvisor;
    }
}
