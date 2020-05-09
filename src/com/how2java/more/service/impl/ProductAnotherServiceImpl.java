package com.how2java.more.service.impl;

import com.how2java.more.service.ProductAnotherService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-27 16:22
 */
@Service("productAnotherService")
public class ProductAnotherServiceImpl implements ProductAnotherService {
    @Override
    public void doSomeAnotherService() {
        System.out.println("另一个说点啥。。。");
    }
}
