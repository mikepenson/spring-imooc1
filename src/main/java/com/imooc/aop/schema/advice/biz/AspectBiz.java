package com.imooc.aop.schema.advice.biz;

/**
 * 实现的业务类
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-24 19:28
 */
public class AspectBiz {

    public void biz(){
        System.out.println("AspectBiz biz");
//        throw new RuntimeException();
    }

    public void init(String bizName,int times){
        System.out.println("AspectBiz init:"+bizName+"  "+times);
    }
}
