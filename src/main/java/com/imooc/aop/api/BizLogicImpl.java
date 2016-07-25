package com.imooc.aop.api;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 13:51
 */
public class BizLogicImpl implements BizLogic {

    @Override
    public String save() {
        System.out.println("BizLogicImpl:LogicImpl save");
        return "Logic save";
//        throw new RuntimeException();
    }
}
