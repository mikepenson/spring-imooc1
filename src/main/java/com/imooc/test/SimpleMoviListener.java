package com.imooc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.Map;
import java.util.Set;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 17:09
 */
public class SimpleMoviListener {
    private Map<String,MovieFinder> movieFinder;
    @Autowired
    public SimpleMoviListener(Map<String,MovieFinder> movieFinder){
        this.movieFinder=movieFinder;
    }
}
