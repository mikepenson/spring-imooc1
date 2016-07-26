package com.imooc.aop.aspectj.biz;

import com.imooc.aop.aspectj.MoocMethod;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-26 14:17
 */
@Service
public class MoocBiz {

    @MoocMethod("MoocBiz save MoocMethod")
    public String save(String args){
        System.out.println("MoocBiz save:"+args);
        return "Save success";
//        throw new RuntimeException("Save failed");
    }
}
