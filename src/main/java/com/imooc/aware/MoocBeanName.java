package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 19:27
 */
public class MoocBeanName implements BeanNameAware,ApplicationContextAware{
    private String beanName;
    @Override
    public void setBeanName(String s) {
        this.beanName=s;
        System.out.println("bean name:"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext:" +applicationContext.getBean(beanName).hashCode());
    }
}
