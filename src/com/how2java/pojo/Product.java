package com.how2java.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-26 16:47
 */
//相当于xml里面的<bean name="product" />
//@Service (这个注解用在业务层)
//@Repository (这个注解用在DAO层) 并能将数据库抛出的异常转化成spring异常处理
//@Controller(这个注解用在控制层) 具有请求转发，重定向的功能
@Component("product")
public class Product {

    private int id;
    private String name = "23";
    //在这里也可以写成@Autowired
    //默认按照name来自动装配，如果没有指定name，则默认按照定义的默认变量来作为name去装配，
    //如果找不到对应的name，则按照type去装配。但是一旦指定了name，则只能按照name去装配了
    @Resource(type = com.how2java.pojo.Category.class)
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
