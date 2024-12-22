package com.patagonia.service.impl;

import com.patagonia.service.MyService;
import org.springframework.stereotype.Service;

/**
 * @author xunfangce
 * @create 2024/12/22
 */
@Service
public class MyServiceImpl implements MyService {
    @Override
    public String methodOne() {
        return "MyService methodOne returned string";
    }
}
