package com.imooc.test.ioc.interfaces;

import com.imooc.ioc.injection.service.InjectService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * 测试注入
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 16:27
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
    public TestInjection(){
        super("classpath*:spring-injection.xml");
    }

    @Test
    public void testSetter() {
        InjectService injectService=super.getBean("injectionService");
        injectService.save("这是设置保存的数据");
    }


    @Test
    public void testCons() {
        InjectService injectService=super.getBean("injectionService");
        injectService.save("这是设置保存的数据");
    }
}
