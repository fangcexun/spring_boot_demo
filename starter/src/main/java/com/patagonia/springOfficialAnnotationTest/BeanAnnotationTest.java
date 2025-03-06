package com.patagonia.springOfficialAnnotationTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author xunfangce
 * @create 2025/3/6
 */
@Configuration
public class BeanAnnotationTest {
    @Bean
    public MyBean myBeanName() {
        return new MyBean();
    }
}
