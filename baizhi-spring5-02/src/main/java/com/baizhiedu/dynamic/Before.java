package com.baizhiedu.dynamic;

import com.baizhiedu.proxy.OrderService;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Before implements MethodBeforeAdvice {
    /*
      作用：需要把运行在原始方法执行之前运行的额外功能，书写在before方法中
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (target instanceof OrderService){
            ((OrderService) target).showOrder();
        }
        System.out.println("-----method before advice log------");
        throw new Exception();
    }
}
