package com.how2java.aspect;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-27 17:29
 */
@Component("springApiAspect")
public class SpringApiAspect implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
