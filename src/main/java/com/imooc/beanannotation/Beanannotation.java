package com.imooc.beanannotation;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 10:15
 */
//@Component("bean")
//@Scope("prototype")
@Scope
@Component
public class Beanannotation {

    public void say(String arg){
        System.out.println("Beanannotation say:"+arg);
    }

    public void myHashCode(){
        System.out.println("BeanAnnotation:"+this.hashCode());
    }
}
