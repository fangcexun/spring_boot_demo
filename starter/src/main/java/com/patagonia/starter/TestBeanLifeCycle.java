package com.patagonia.starter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xunfangce
 * @create 2024/12/29
 */
@Component("testBeanLifeCycle") // Scanned...Definition 来创建 bean
@Slf4j
public class TestBeanLifeCycle {
    // 1. 构造方法
    public TestBeanLifeCycle() {
        System.out.println("TestBeanLifeCycle Constructor");
    }

    // 2. 注入方法
    @Autowired
    public void testDI() {
        // 按理来说这种依赖注入方法需要传一个对应的 Spring Bean，
        // 但这里面为了解释 TestBeanLifeCycle 这个 Bean 初始化的一定会走这个 testDI 方法，所以没有设定对应的 Bean 作为入参
        System.out.println("Autowired 注解依赖注入");
    }

    // 3. 初始化方法（构造方法后执行），习惯写为 init()
    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct 注解");
    }


    // 4. 销毁方法
    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy 注解");
    }

}
