package com.patagonia.spring_boot_starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xunfangce
 * @create 2024/3/31
 */
@Controller
public class ControllerTest {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test good";
    }
}
