package com.imooc.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 14:15
 */
public class MoocBeforeAdice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("MoocBeforeAdvice:"+method.getName()+"   "+target.getClass().getName());
    }
}
