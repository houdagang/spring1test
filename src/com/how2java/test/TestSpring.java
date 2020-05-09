package com.how2java.test;

import com.how2java.more.service.anot.impl.ProImpl;
import com.how2java.more.service.impl.ProductAnotherServiceImpl;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.service.impl.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-26 16:34
 */
public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        //spring 1
        Category bean = (Category) context.getBean("cate");
        System.out.println(bean.getName());

        //spring 2
        Product bean1 = (Product) context.getBean("product");
        System.out.println(bean1.getName());
        System.out.println(bean1.getCategory().getName());

        //spring AOP
        //引入切面前，先调用试试
        ProductServiceImpl service1 = (ProductServiceImpl) context.getBean("productService");
        service1.doSomeService();
        //如果调用的该类实现类至少一个接口，在未配置<aop:aspectj-autoproxy proxy-target-class="true"/>
        //的前提下，会报错。 或者将其接受的类型改为接口，而并非实现类
        ProductAnotherServiceImpl service2 = (ProductAnotherServiceImpl) context.getBean("productAnotherService");
        service2.doSomeAnotherService();
        ProImpl service3 = (ProImpl) context.getBean("proImpl");
        service3.doSomeAnotherService();

    }

}
