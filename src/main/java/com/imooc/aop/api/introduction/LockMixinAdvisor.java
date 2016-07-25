package com.imooc.aop.api.introduction;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 15:40
 */
public class LockMixinAdvisor extends DefaultIntroductionAdvisor{

    public LockMixinAdvisor(){
        super(new LockMixin(),Lockable.class);
    }
}
