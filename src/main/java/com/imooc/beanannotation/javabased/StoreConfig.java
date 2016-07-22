package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-23 0:13
 */
@Configuration
@ImportResource("classpath:/config.xml")
public class StoreConfig {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager(){
        return new MyDriverManager(url,username,password);
    }


 /*   @Bean(initMethod = "init",destroyMethod = "destroy")
    public Store stringStore(){
        return new StringStore();
    }*/
}
