package com.imooc.test.resource;

import com.imooc.resource.MoocResource;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 21:36
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase{

    public TestResource(){
        super("classpath*:spring-resource.xml");
    }

    @Test
    public void testResource() throws IOException{
        MoocResource resource=super.getBean("moocResource");
        resource.resource();
    }

}
