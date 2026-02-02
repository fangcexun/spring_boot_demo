package com.patagonia.controller;

import java.util.Arrays;

import com.patagonia.service.MyService;
import com.patagonia.service.pojo.request.PersonRequest;
import com.patagonia.service.pojo.request.RequestInner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xunfangce
 * @create 2024/12/22
 */
@Controller
public class MainController {
    @Autowired
    private MyService myService;

    @RequestMapping("/mainController")
    @ResponseBody
    public String test() {
        return myService.methodOne();
    }

    @RequestMapping("/mainController2")
    @ResponseBody
    public String test2() {
        RequestInner requestInner = new RequestInner();

        PersonRequest personRequest = new PersonRequest();
        requestInner.setPersonRequestList(Arrays.asList(personRequest));

        try {
            return myService.methodTwo(requestInner);
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
        return "error";
    }

    @RequestMapping("/mainController3")
    @ResponseBody
    public String test3() {
        RequestInner requestInner = new RequestInner();

        PersonRequest personRequest = new PersonRequest();
        personRequest.setAge("1");
        personRequest.setName("1");

        requestInner.setPersonRequestList(Arrays.asList(personRequest));
        try {
            return myService.methodThree(Arrays.asList(requestInner));
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
        return "error";
    }
}
