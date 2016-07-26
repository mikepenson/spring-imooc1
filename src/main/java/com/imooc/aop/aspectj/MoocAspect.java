package com.imooc.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-26 14:12
 */
@Component
@Aspect
public class MoocAspect {
    @Pointcut("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut(){}

    @Pointcut("within(com.imooc.aop.aspectj.biz.*)")
    public void bizPointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("Before.");
    }
    @AfterReturning(pointcut = "bizPointcut()",
    returning = "returnVal")
    public void afterReturning(Object returnVal){
        System.out.println("AfterReturning:"+returnVal);
    }

    @AfterThrowing(pointcut = "pointcut()",
    throwing = "e")
    public void afterThrowing(RuntimeException e){
        e.printStackTrace();
        System.out.println("AfterThrowing:"+e.getMessage());
    }
    @After("pointcut()")
    public void after(){
        System.out.println("After.");
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("around 1");
        Object obj=pjp.proceed();
        System.out.println("around 2");
        System.out.println("around:"+obj);
        return obj;
    }

    @Before("pointcut() && args(arg)")
    public void beforeWithParam(String arg){
        System.out.println("BeforeWithParam:"+arg);
    }

    @Before("pointcut() && @annotation(moocMethod)")
    public void beforeWithAnnotation(MoocMethod moocMethod){
        System.out.println("BeforeWithAnnotation:"+moocMethod.value());
    }
}
