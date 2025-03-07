package com.patagonia.propertySetTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xunfangce
 * @create 2025/3/7
 */
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Value("${app.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }
}
