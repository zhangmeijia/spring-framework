package com.lagou.ioc;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author MJ
 * @date 2021/5/6
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        System.out.println("BeanPostProcessor 实现类构造函数...");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if ("lagouBean".equals(beanName)) {
            System.out.println("BeanPostProcessor 实现类 postProcessBeforeInitialization ⽅法被调⽤中......");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if ("lagouBean".equals(beanName)) {
            System.out.println("BeanPostProcessor 实现类 postProcessAfterInitialization ⽅法被调⽤中......");
        }
        return bean;
    }
}