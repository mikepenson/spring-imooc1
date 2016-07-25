package com.imooc.aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 14:54
 */
public class MoocAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] arge, Object target) throws Throwable {
        System.out.println("MoocAfterReturningAdvice:"
                +method.getName()+" "+target.getClass().getName()+"  "+returnValue);
    }
}
