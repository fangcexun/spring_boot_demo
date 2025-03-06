package com.patagonia.repo.impl;

import com.patagonia.repo.MyRepoService;
import org.springframework.stereotype.Repository;

/**
 * @author xunfangce
 * @create 2025/3/6
 */
@Repository
public class MyRepoServiceImpl implements MyRepoService {
    @Override
    public String myRepoFunction() {
        System.out.println("MyRepoServiceImpl myRepoFunction");
        return "MyRepoServiceImpl myRepoFunction";
    }
}
