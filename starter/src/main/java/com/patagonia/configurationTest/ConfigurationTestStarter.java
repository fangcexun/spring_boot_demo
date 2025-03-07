package com.patagonia.configurationTest;

import com.patagonia.springOfficialAnnotationTest.MyBean;
import com.patagonia.starter.SpringBootStarterApplication;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author xunfangce
 * @create 2025/3/7
 */
@SpringBootApplication(scanBasePackages = {"com.patagonia.*"})
//@Import(ConfigBean.class)
public class ConfigurationTestStarter {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);

        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        Object myPojo = context.getBean("myPojo");

        if (myPojo instanceof TestPojo) {
            System.out.println("Main method returned: " + ((TestPojo)myPojo).functionOne());
        }
    }
}
