package com.imooc.ioc.interfaces;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 15:45
 */
public class Main {
    public static void main(String[] args){
        OneInterface oneInterfac=new OneInterfaceImpl();
        oneInterfac.say("hello");
    }
}
