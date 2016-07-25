package com.imooc.aop.schema.advice;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 0:04
 */
public class FitImpl implements Fit {

    @Override
    public void filter() {
        System.out.println("FitImpl filter");
    }
}
