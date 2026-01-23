package com.patagonia.service.pojo.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author xunfangce
 * @create 2026/1/20
 */
@Data
public class RequestInner {
    @NotNull(message = "requestId不能为空")
    @Size(min = 1, message = "requestId不能为空")
    String requestId;

    @NotNull(message = "personRequestList不能为空")
    @Size(min = 1, message = "personRequestList不能为空")
    @Valid
    List<PersonRequest> personRequestList;
}
