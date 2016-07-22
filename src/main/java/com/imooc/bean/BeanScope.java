package com.imooc.bean;

/**
 * bean的作用域
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 17:20
 */
public class BeanScope {

    public void say(){
        System.out.println("BeanScope say : " + this.hashCode());
    }
}
