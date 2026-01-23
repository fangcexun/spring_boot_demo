package com.patagonia.service.pojo.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * @author xunfangce
 * @create 2026/1/22
 */
@Data
public class PersonRequest {
    @NotNull(message = "姓名不能为空")
    @Size(min = 1, message = "姓名不能为空")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Size(min = 1, message = "年龄不能为空")
    private String age;
}
