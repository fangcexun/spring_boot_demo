package com.patagonia.service.impl;

import com.patagonia.repo.MyRepoService;
import com.patagonia.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xunfangce
 * @create 2024/12/22
 */
@Service
public class MyServiceImpl implements MyService {

    private MyRepoService myRepoService;

    @Autowired
    public void setMyRepoService(MyRepoService myRepoService) {
        this.myRepoService = myRepoService;
    }

    @Override
    public String methodOne() {
        String repoResult = myRepoService.myRepoFunction();
        String serviceMethod = "MyService methodOne";

        System.out.println(repoResult + " " + serviceMethod);
        return repoResult + " " + serviceMethod;
    }
}
