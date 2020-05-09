package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Controller;

/**
 * @ProjectName : spring1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-04-27 16:26
 */
@Controller("loggerAspect")
public class LoggerAspect {

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法开始：" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("方法结束：" + joinPoint.getSignature().getName());
        return object;
    }

}
