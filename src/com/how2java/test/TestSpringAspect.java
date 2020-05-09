package com.how2java.test;

import com.how2java.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-28 17:15
 */
//表示这是spring的一个测试类
@RunWith(SpringJUnit4ClassRunner.class)
//定位Spring的配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringAspect {

    //AutoWired
    //@Resource(type = com.how2java.pojo.Category.class)
    @Resource(name = "cate")
    Category c;

    @Test
    public void test() {
        System.out.println(c.getName());
    }



}
