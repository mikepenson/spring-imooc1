package com.imooc.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-22 19:17
 */
@Order(1)
@Component
public class BeanImplTwo implements BeanInterfacce {}
