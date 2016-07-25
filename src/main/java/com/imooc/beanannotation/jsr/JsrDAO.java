package com.imooc.beanannotation.jsr;

import org.springframework.stereotype.Repository;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-23 11:26
 */
@Repository
public class JsrDAO {
    public void save(){
        System.out.println("JsrDao invoked.");
    }
}
