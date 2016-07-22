package com.imooc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 17:09
 */
public class SimpleMoviListener {
    @Autowired
    private MovieFinder movieFinder;
    @Autowired
    public SimpleMoviListener(MovieFinder movieFinder){
        this.movieFinder=movieFinder;
    }
}
