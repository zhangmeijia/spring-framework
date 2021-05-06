package com.example.lagou;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author MJ
 * @date 2021/5/6
 */
public class LagouBean implements InitializingBean {
    /**
     * 构造函数
     */
    public LagouBean() {
        System.out.println("LagouBean 构造器...");
    }

    /**
     * InitializingBean 接⼝实现
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("LagouBean afterPropertiesSet...");
    }
}