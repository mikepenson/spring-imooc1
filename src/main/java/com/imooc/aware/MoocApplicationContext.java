package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 19:26
 */
public class MoocApplicationContext implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println("MoocApplicationContext:"+applicationContext.getBean("moocApplicationContext").hashCode());
    }

}
