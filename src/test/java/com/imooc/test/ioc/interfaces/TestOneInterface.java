package com.imooc.test.ioc.interfaces;

import com.imooc.ioc.interfaces.OneInterface;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * 单元测试一个接口
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 15:52
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    public TestOneInterface(){
        super("classpath*:spring-ioc.xml");
    }
    @Test
    public void testHello(){
        OneInterface oneInterface=super.getBean("oneInterface");
        oneInterface.say("hello");
    }
}
