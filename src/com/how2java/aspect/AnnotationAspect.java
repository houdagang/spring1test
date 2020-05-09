package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-28 16:47
 */
//经测试，注解切面在所有切面中最后一个执行。
@Aspect
@Component
public class AnnotationAspect {

    @Before("execution(* com.how2java.service.impl.ProductServiceImpl.*(..))")
    public void before() {
        System.out.println("方法开始：");
    }

}
