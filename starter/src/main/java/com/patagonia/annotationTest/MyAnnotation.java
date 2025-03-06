package com.patagonia.annotationTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xunfangce
 * @create 2025/3/6
 */
// 定义注解
@Retention(RetentionPolicy.RUNTIME) // 注解在运行时保留
@Target(ElementType.TYPE) // 可用在类上
public @interface MyAnnotation {
    String annotationValue() default "defaultValue";
}
