package com.patagonia.starter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author xunfangce
 * @create 2024/12/29
 */
@Component
@Slf4j
public class TestBean {
    // 1. 构造方法
    public TestBean() {
        System.out.println("TestBean Constructor");
        log.info("TestBean Constructor");
    }
    // 2. 注入方法
    @Autowired
    public void autowireFunction() {
        System.out.println("TestBean autowire");
    }

    @Bean
    public void beanFunction() {
        System.out.println("TestBean bean");
    }

    // 3. 初始化方法
    @PostConstruct
    public void init() {
        System.out.println("TestBean init");
    }
    // 4. 销毁方法
    @PreDestroy
    public void destroy() {
        System.out.println("TestBean destroy");
    }

}
