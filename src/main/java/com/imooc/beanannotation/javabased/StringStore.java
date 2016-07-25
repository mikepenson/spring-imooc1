package com.imooc.beanannotation.javabased;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-23 0:12
 */
public class StringStore implements Store<String> {

    public void init(){
        System.out.println("This is init");
    }

    public void destroy(){
        System.out.println("This is destroy");
    }
}
