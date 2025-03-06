package com.patagonia.springOfficialAnnotationTest;

import org.springframework.context.annotation.Bean;

/**
 * @author xunfangce
 * @create 2025/3/6
 */
public class CreateBeanTest {
    @Bean
    public MyBean myBeanNameManually() {
        System.out.println("create bean manually");
        return new MyBean();
    }
}
