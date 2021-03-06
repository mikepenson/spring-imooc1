package com.imooc.test.beanannotation;

import com.imooc.beanannotation.javabased.MyDriverManager;
import com.imooc.beanannotation.javabased.Store;
import com.imooc.beanannotation.javabased.StringStore;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-23 0:14
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavaBased extends UnitTestBase{
    public TestJavaBased(){
        super("classpath*:spring-annotation.xml");
    }
    @Test
    public void test(){
        Store store=super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }
    @Test
    public void testDriverManager(){
        MyDriverManager driverManager=super.getBean("myDriverManager");
        System.out.println(driverManager.getClass().getName());
    }
    @Test
    public void testScope(){
        Store store=super.getBean("stringStore");
        System.out.println(store.hashCode());

        store=super.getBean("stringStore");
        System.out.println(store.hashCode());
    }
    @Test
    public void testG(){
        StringStore store=super.getBean("stringStoreTest");
    }
}
