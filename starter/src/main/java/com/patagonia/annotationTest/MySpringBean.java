package com.patagonia.annotationTest;

import org.springframework.stereotype.Component;

/**
 * @author xunfangce
 * @create 2025/3/6
 */
@Component("mySpringBean")
@MyAnnotation(annotationValue = "mySpringBean")
public class MySpringBean {
    public String mySpringBeanFunction() {
        System.out.println("MySpringBean mySpringBeanFunction");
        return "MySpringBean mySpringBeanFunction";
    }
}
