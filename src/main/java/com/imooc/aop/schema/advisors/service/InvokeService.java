package com.imooc.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 13:09
 */
@Service
public class InvokeService {
    //能够正常调用，循环执行一次就可以结束
    public void invoke(){
        System.out.println("invakeService ....");
    }
    //抛出异常，尝试执行4次后打印尝试次数，抛出异常
    public void invokeExveption(){
        throw new PessimisticLockingFailureException("");
    }
}
