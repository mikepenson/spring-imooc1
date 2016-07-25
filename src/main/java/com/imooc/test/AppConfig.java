package com.imooc.test;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 23:44
 */
@Configuration
@ImportResource("classpath:jdbc.properties")
public class AppConfig {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
//        return new DriverManagerDataSource(url,username,password);
        return null;
    }
}
