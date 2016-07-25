package com.imooc.test.aop;

import com.imooc.aop.schema.advice.Fit;
import com.imooc.aop.schema.advice.biz.AspectBiz;
import com.imooc.aop.schema.advisors.service.InvokeService;
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
public class TestAOPSchemaAdvisor extends UnitTestBase{

    public TestAOPSchemaAdvisor(){
        super("classpath:spring-aop-schema-advisor.xml");
    }

    @Test
    public void testSave(){
        //正常的执行
        InvokeService service=super.getBean("invokeService");
        service.invoke();

        System.out.println();
        //每次执行都会抛出一个异常
        service.invokeExveption();
    }
}
