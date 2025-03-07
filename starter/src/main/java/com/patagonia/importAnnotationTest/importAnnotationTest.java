package com.patagonia.importAnnotationTest;

import com.patagonia.springOfficialAnnotationTest.MyBean;
import com.patagonia.starter.SpringBootStarterApplication;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author xunfangce
 * @create 2025/3/7
 */
@SpringBootApplication(scanBasePackages = {"com.patagonia.*"})

public class importAnnotationTest {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);

        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        Object myProductService = beanFactory.getBean("myProductService");

        if (myProductService instanceof MyProductService) {
            System.out.println("Main method returned: " + ((MyProductService)myProductService).myProductFunction());
        }
    }
}
