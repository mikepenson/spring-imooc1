package com.imooc.test.aop;

import com.imooc.aop.schema.advice.Fit;
import com.imooc.aop.schema.advice.biz.AspectBiz;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-24 19:41
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase{

    public TestAOPSchemaAdvice(){
        super("classpath:spring-aop-schema-advice.xml");
    }

    @Test
    public void testBiz(){
        AspectBiz biz=super.getBean("aspectBiz");
//        biz.biz();
        biz.init("mooc service",3);
    }
    @Test
    public void testFilter(){
        Fit fit=super.getBean("aspectBiz");
        fit.filter();
    }
}
