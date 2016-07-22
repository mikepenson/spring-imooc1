package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * bean的声明周期
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 18:36
 */
public class BeanLifeCycle implements InitializingBean,DisposableBean{

    public void start(){
        System.out.println("bean start");
    }
    public void stop() {
        System.out.println("bean stop");
    }

   @Override
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean afterPropertiesSet");

    }

    public void defaultInit(){
        System.out.println("Bean DefautInit");
    }
    public void defaultDestroy(){
        System.out.println("bean defaultDestroy");
    }
}
