package com.patagonia.service.impl;

import java.util.List;

import javax.validation.Valid;

import com.patagonia.service.MyService;
import com.patagonia.service.pojo.request.RequestInner;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author xunfangce
 * @create 2024/12/22
 */
@Service
@Validated
public class MyServiceImpl implements MyService {
    @Override
    public String methodOne() {
        return "MyService methodOne returned string";
    }

    @Override
    public String methodTwo(@Valid RequestInner requestInner) {
        return requestInner.getPersonRequestList().toString();
    }

    @Override
    public String methodThree(@Valid List<RequestInner> requestInnerList) {
        return requestInnerList.stream().toString();
    }
}
