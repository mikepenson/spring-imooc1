package com.imooc.test.lifecycle;

import com.imooc.test.base.UnitTestBase;
import org.junit.Test;

/**
 * 测试bean的生命周期
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 18:39
 */
public class TestBeanLifeCycle extends UnitTestBase{
    public TestBeanLifeCycle(){
        super("classpath*:spring-lifecycle.xml");
    }

    @Test
    public void test1(){
        super.getBean("beanLifeCycle");
    }
}
