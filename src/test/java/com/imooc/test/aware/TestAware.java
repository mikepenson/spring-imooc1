package com.imooc.test.aware;

import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * 测试Aware
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 19:24
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase{

    public TestAware(){
        super("classpath*:spring-aware.xml");
    }
    @Test
    public void testMoocApplicationContext(){
        System.out.println("testMoocApplicationContext:"+super.getBean("moocApplicationContext").hashCode());
    }

    @Test
    public void testMoocBeanName(){
        System.out.println("testMoocBeanName:"+super.getBean("moocBeanName").hashCode());
    }
}
