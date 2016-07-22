package com.imooc.ioc.injection.service;

import com.imooc.ioc.injection.dao.InjectionDAO;

/**
 * InjectService的实现类
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 16:17
 */
public class InjectServiceImpl implements InjectService {
    private InjectionDAO injectionDAO;

    //设置注入
//    public void setInjectionDAO(InjectionDAO injectionDAO) {
//        this.injectionDAO = injectionDAO;
//    }

    public InjectServiceImpl(InjectionDAO injectionDAO){
        this.injectionDAO=injectionDAO;
    }


    @Override
    public void save(String args) {
        args=args+":"+this.hashCode();
        System.out.println("service接收参数："+args);
    }
}
