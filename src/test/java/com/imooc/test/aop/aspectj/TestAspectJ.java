package com.imooc.test.aop.aspectj;

import com.imooc.aop.aspectj.biz.MoocBiz;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-26 14:39
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends UnitTestBase {

    public TestAspectJ(){
        super("classpath*:spring-aop-aspectj.xml");
    }
    @Test
    public void test(){
        MoocBiz biz=getBean("moocBiz");
        biz.save("This is test");
    }
}
