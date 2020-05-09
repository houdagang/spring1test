package com.how2java.pojo;

import org.springframework.stereotype.Component;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-26 16:33
 */
//相当于xml里面的<bean name="category" />
@Component("cate")
public class Category {

    private String name = "1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
