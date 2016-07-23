package com.imooc.test.beanannotation;

import com.imooc.beanannotation.jsr.JsrService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-23 11:28
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {

    public TestJsr(){
        super("classpath*:spring-annotation.xml");
    }

    @Test
    public void testSave(){
        JsrService service=super.getBean("jsrService");
        service.save();
    }
}
