package com.patagonia.springOfficialAnnotationTest;

import com.patagonia.starter.SpringBootStarterApplication;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author xunfangce
 * @create 2025/3/6
 */
@SpringBootApplication(scanBasePackages = {"com.patagonia.*"})
public class OfficialAnnotationTestStarter {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);

        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        Object myBean = context.getBean("myBeanName");

        if (myBean instanceof MyBean) {
            System.out.println("Main method returned: " + ((MyBean)myBean).myBeanFunction());
        }
    }

}
