package com.patagonia.configurationTest;


import org.springframework.context.annotation.Bean;

/**
 * @author xunfangce
 * @create 2025/3/7
 */
public class ConfigBean {
    @Bean("myPojo")
    public TestPojo registerPojo() {
        return new TestPojo();
    }
}
