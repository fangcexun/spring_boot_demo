package com.patagonia.starter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author xunfangce
 * @create 2024/12/29
 */
@Component("testBeanName") // Scanned...Definition 来创建 bean
@Slf4j
public class TestBean {
    // 1. 构造方法
    public TestBean() {
        System.out.println("TestBean Constructor");
    }
    // 2. 注入方法
    @Bean // Configuration...Definition 来创建 bean
    public void beanFunction() {
        System.out.println("TestBean bean");
    }

    // 3. 初始化方法
    @PostConstruct
    public void init() {
        System.out.println("TestBean init");
    }

    public void myFunction() {
        System.out.println("TestBean myFunction");
    }
    // 4. 销毁方法
    @PreDestroy
    public void destroy() {
        System.out.println("TestBean destroy");
    }

}
