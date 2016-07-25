package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-23 0:13
 */

@Configuration
//@ImportResource("classpath:/config.xml")
public class StoreConfig {
  /*  @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager(){
        return new MyDriverManager(url,username,password);
    }*/


 /*   @Bean(initMethod = "init",destroyMethod = "destroy")
    public Store stringStore(){
        return new StringStore();
    }*/
    /*@Bean(name = "stringStore")
    @Scope(value = "prototype")
    public Store stringStore(){
        return new StringStore();
    }*/


    @Autowired
    private Store<Integer> s1;
    @Autowired
    private Store<String> s2;

    @Bean
    public IntegerStore integerStore(){
        return new IntegerStore();
    }
    @Bean
    public StringStore stringStore(){
        return new StringStore();
    }
    @Bean(name = "stringStoreTest")
    public Store stringStoreTest(){
        /*System.out.println("s1:"+s1.getClass().getName());
        System.out.println("s2:"+s2.getClass().getName());*/
        return new StringStore();
    }
}
