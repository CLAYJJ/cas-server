package com.sso.cas.server.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
/*
 *
 *
 * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
 *          throws-pattern?)
 *
 * 执行结果：
 * 方法：findAllaround 前！
 * 方法：findAll执行前执行！
 * 方法：findAllaround 后！
 * 方法：findAll执行后执行！
 *
 * @Author luo jiajia
 * @Date 2018/6/10 0010 下午 17:00
 */

@Aspect
@Component
public class Example {
    @Before("execution(* com.sso.cas.server.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法："+method.getName()+"执行前执行！");
    }
    @After("execution(* com.sso.cas.server.service.*.*(..))")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法："+method.getName()+"执行后执行！");
    }

    @Around("execution(* com.sso.cas.server.service.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法："+method.getName()+"around 前！");
        Object retVal = proceedingJoinPoint.proceed();
        System.out.println("方法："+method.getName()+"around 后！");
        return retVal;
    }
}
