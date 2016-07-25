package com.imooc.aop.api.introduction;

import com.imooc.aop.api.introduction.Lockable;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 15:34
 */
public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

    private boolean locked;

    @Override
    public void lock() {
        this.locked=true;
    }

    @Override
    public void unLock() {
        this.locked=false;
    }

    @Override
    public boolean locked() {
        return this.locked;
    }

    public Object invoke(MethodInvocation invocation) throws  Throwable{
        if (locked()&&invocation.getMethod().getName().indexOf("set")==0){
            throw new RuntimeException();
        }
        return super.invoke(invocation);
    }
}
