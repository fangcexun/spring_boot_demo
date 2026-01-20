package com.patagonia.service.pojo.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author xunfangce
 * @create 2026/1/20
 */
@Data
public class RequestInner {
    /**
     * 姓名，不能为空（包括 null、空字符串和空白字符）
     */
    @NotBlank(message = "name不能为空")
    private String name;

    /**
     * 年龄，不能为空（包括 null、空字符串和空白字符）
     */
    @NotBlank(message = "age不能为空")
    private String age;
}
