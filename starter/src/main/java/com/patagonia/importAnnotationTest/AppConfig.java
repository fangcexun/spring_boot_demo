package com.patagonia.importAnnotationTest;

import org.springframework.context.annotation.Bean;

/**
 * @author xunfangce
 * @create 2025/3/7
 */
public class AppConfig {
    @Bean("myRepoService")
    public MyRepoService registerMyRepoService() {
        return new MyRepoService();
    }
}
