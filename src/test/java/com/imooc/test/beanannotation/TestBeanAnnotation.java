package com.imooc.test.beanannotation;

import com.imooc.beanannotation.Beanannotation;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 10:15
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase{

    public TestBeanAnnotation(){
        super("classpath*:spring-annotation.xml");
    }

    @Test
    public void testSay(){
        Beanannotation beanannotation=super.getBean("bean");
        beanannotation.say("This is a test");

        beanannotation=super.getBean("beanannotation");
        beanannotation.say("This is a test");
    }
    @Test
    public void testScope(){
        Beanannotation beanannotation=super.getBean("beanannotation");
        beanannotation.myHashCode();

        beanannotation=super.getBean("beanannotation");
        beanannotation.myHashCode();
    }
}
