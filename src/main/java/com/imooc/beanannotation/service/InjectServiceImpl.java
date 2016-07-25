package com.imooc.beanannotation.service;

import com.imooc.beanannotation.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * InjectService的实现类
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 16:17
 */
@Service
public class InjectServiceImpl implements InjectService {

    private InjectionDAO injectionDAO;

    //设置注入
//    public void setInjectionDAO(InjectionDAO injectionDAO) {
//        this.injectionDAO = injectionDAO;
//    }
    //必须有一个空构造器
//    public InjectServiceImpl(){}
//
    @Autowired
    public InjectServiceImpl(InjectionDAO injectionDAO){
        this.injectionDAO=injectionDAO;
    }


    @Override
    public void save(String args) {
        args=args+":"+this.hashCode();
        System.out.println("service接收参数："+args);
    }
}
