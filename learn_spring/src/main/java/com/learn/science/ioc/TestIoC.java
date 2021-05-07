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
		// ApplicationContext是容器的高级接口，BeanFacotry (顶级容器/根容器,规范了/定义了容器的基础行为)
		// Spring应用上下文，官方称之为IoC容器(错误的认识:容器就是map而已;准确来说, map是ioc容器的一个成员,
		// 叫做单例池，singleton0bjects, 容器是- -组组件和过程的集合，包括BeanFactory、单例池、BeanPostProcessor等以及 之间的协作流程)
		/**
		 * Ioc容器创建管理Bean对象的，Spring Bean是有生命周期的
		 * 构造器执行，初始化方法执行,Bean后置处理器before/after方法执行：AbstractApplicationContext#refresh#finishBeanFactoryInitialization
		 * Bean工厂后置处理器初始化，方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryProcessors
		 * Bean后置处理器初始化，方法执行：AbstractApplicationContext#refresh#registerBeanFactoryProcessors
		*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
        System.out.println(lagouBean);
    }



}
