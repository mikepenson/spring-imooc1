package com.imooc.test.beanannotation;

import com.imooc.beanannotation.multibean.BeanInvoke;
import com.imooc.beanannotation.service.InjectService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 17:38
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection(){
        super("classpath*:spring-annotation.xml");
    }
    @Test
    public void testAutowired(){
        InjectService service=super.getBean("injectServiceImpl");
        service.save("this is autowired");
    }
    @Test
    public void testMultiBean(){
        BeanInvoke beanInvoke=super.getBean("beanInvoke");
        beanInvoke.say();
    }
}
