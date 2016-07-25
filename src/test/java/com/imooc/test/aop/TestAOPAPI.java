package com.imooc.test.aop;

import com.imooc.aop.api.BizLogic;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 14:11
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase {

    public TestAOPAPI(){
        super("classpath*:spring-aop-api.xml");
    }
    @Test
    public void testSave(){
        BizLogic logic=super.getBean("bizLogicImpl");
        logic.save();
    }
}
