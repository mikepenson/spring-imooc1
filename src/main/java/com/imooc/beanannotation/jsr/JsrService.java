package com.imooc.beanannotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-23 11:26
 */
//@Service
    @Named
public class JsrService {
//    @Resource
//    @Inject
    private JsrDAO jsrDAO;

//    @Resource
    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }
    @PostConstruct
    public void init(){
        System.out.println("JsrService init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("JsrService destroy");
    }

    public void save(){
        jsrDAO.save();
    }
}
