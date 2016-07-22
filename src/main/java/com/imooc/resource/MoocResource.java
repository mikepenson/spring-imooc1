package com.imooc.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 21:36
 */
public class MoocResource implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException{
       Resource resource= applicationContext.getResource("url:http://mp.weixin.qq.com/s?__biz=MzA5NDE3OTQ0NA==&mid=214209055&idx=1&sn=8d99cba692a2319d3373810fa67eb3da&scene=23&srcid=BYE0FXjHp1sr8jyrCsKG#rd");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());

    }
}
