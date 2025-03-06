package com.patagonia.starter;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.patagonia.*"})
public class SpringBootFactoryStarterApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);

        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        // configurableApplicationContext 实例类型
        System.out.println("容器的实现类 " + context.getClass());

        // beanFactory 实例类型
        System.out.println("beanFactory 的实现类 " + beanFactory.getClass());

        // beanDefinition 实例类型
        System.out.println("testBeanName 的 definition 实现类 " + beanFactory.getBeanDefinition("testBeanLifeCycle").getClass());
        System.out.println("beanFunction 的 definition 实现类 " + beanFactory.getBeanDefinition("beanFunction").getClass());
    }

}