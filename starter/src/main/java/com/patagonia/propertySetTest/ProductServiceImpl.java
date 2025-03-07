package com.patagonia.propertySetTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author xunfangce
 * @create 2025/3/7
 */
@Service("productService")
public class ProductServiceImpl {
    @Autowired
    private AppConfig appConfig;

    public String getData() {
        return "Data from " + appConfig.getAppName();
    }
}
