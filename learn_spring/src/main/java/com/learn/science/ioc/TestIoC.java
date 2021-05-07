package com.learn.science.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ioc 容器源码分析基础案例
 * @author MJ
 * @date 2021/5/6
 */
public class TestIoC {
    @Test
    public void testIoC() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
        System.out.println(lagouBean);
    }

}
