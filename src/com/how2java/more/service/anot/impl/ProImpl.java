package com.how2java.more.service.anot.impl;

import org.springframework.stereotype.Service;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-27 17:25
 */
@Service("proImpl")
public class ProImpl {

    public void doSomeAnotherService() {
        System.out.println("最后一个说点啥。。。");
    }

}
