package com.imooc.beanannotation.dao;

import org.springframework.stereotype.Repository;

/**
 * 注入DAO的实现类
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 16:16
 */
@Repository
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String args) {
        //模拟数据库保存操作
        System.out.println("保存数据："+args);
    }
}
