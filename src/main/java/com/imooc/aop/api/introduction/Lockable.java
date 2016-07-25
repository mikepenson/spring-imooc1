package com.imooc.aop.api.introduction;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-25 15:33
 */
public interface Lockable {
    void lock();
    void unLock();
    boolean locked();
}
