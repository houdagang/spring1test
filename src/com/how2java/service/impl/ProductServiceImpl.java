package com.how2java.service.impl;

import com.how2java.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-27 16:19
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Override
    public void doSomeService() {
        System.out.println("说点啥。。。");
    }
}
