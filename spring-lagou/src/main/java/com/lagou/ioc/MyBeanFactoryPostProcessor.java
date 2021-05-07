package com.lagou.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author MJ
 * @date 2021/5/6
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        System.out.println("BeanFactoryPostProcessor的实现类构造函数...");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory
                                               beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor的实现⽅法调⽤中......");
    }
}