package com.imooc.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 19:16
 */
@Component
public class BeanInvoke {

    @Autowired
    private List<BeanInterfacce> list;
    @Autowired
    private Map<String,BeanInterfacce> map;

    @Autowired
    @Qualifier("beanImplOne")
    private BeanInterfacce interfacce;

    public void say(){
        if (list!=null&&list.size()!=0){
            System.out.println("list...");
            for (BeanInterfacce bean:list){
                System.out.println(bean.getClass().getName());
            }
        }else {
            System.out.println("List<BeanInterface> is null!");
        }

        System.out.println();

        if (map!=null&&map.size()!=0){
            System.out.println("map...");
            for (Map.Entry<String,BeanInterfacce> entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue().getClass().getName());
            }
        }else {
            System.out.println("Map<String,BeanInterface> map is null!!!");

        }

        System.out.println();

        if (interfacce!=null){
            System.out.println(interfacce.getClass().getName());
        }else {
            System.out.println("beaninterface is null...");
        }
    }
}
