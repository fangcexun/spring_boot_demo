package com.patagonia.importAnnotationTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * @author xunfangce
 * @create 2025/3/7
 */
@Service
@Import(AppConfig.class)
public class MyProductService {
    @Autowired
    private MyRepoService myRepoService;

    public String myProductFunction() {
        String repoString = myRepoService.myRepoFunction();
        System.out.println("MyProductService myProductFunction");
        return "product returned string " + repoString;
    }
}
