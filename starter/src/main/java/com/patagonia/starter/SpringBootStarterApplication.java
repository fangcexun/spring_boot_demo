package com.patagonia.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.patagonia.controller", "com.patagonia.service"})
public class SpringBootStarterApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);

        // configurableApplicationContext 实例类型
        System.out.println(context);
        System.out.println(context.getClass());

        // beanFactory 实例类型
        System.out.println(context.getBeanFactory().getClass());

        // beanDefinition 实例类型


    }

}
