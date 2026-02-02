package com.patagonia.service;

import java.util.List;

import com.patagonia.service.pojo.request.RequestInner;

import javax.validation.Valid;

/**
 * @author xunfangce
 * @create 2024/12/22
 */
public interface MyService {
    String methodOne();
    
    /**
     * 方法二，对请求参数进行校验
     * @param requestInner 请求参数，使用 @Valid 进行校验
     * @return 处理结果
     */
    String methodTwo(@Valid RequestInner requestInner);

    String methodThree(@Valid List<RequestInner> requestInnerList);
}
