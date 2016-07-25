package com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-24 19:27
 */
public class MoocAspect {

    //前置通知
    public void before() {
        System.out.println("moocAspect before");
    }
    //方法返回之后的通知
    public void afterReturning() {
        System.out.println("moocAspect AfterReturning");
    }
    //抛出异常之后的通知
    public void afterThrowing() {
        System.out.println("moocAsect AfterThrowing");
    }
    //方法结束之前的通知
    public void after() {
        System.out.println("moocAspect After");
    }
    //环绕通知
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //具体业务的返回值
        Object obj = null;

        System.out.println("moocAspect around 1");
        //具体业务方法的执行
        obj = pjp.proceed();
        System.out.println("moocAspect around 2");
        return obj;
    }

    public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times){
        System.out.println(bizName+"    "+times);
        Object obj = null;

        try {
            System.out.println("moocAspect aroundInit 1");
            obj = pjp.proceed();
            System.out.println("moocAspect aroundInit 2");
        }catch (Throwable e){
            e.printStackTrace();
        }
        return obj;
    }
}
