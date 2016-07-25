package com.imooc.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 14:59
 */
public class MoocMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("MoocMethodInterceptor 1:"+methodInvocation.getMethod().getName()+"    "
                +methodInvocation.getStaticPart().getClass().getName());
        Object obj=methodInvocation.proceed();
        System.out.println("MoocMethodInterceptor 1:"+obj);
        return obj;
    }
}
