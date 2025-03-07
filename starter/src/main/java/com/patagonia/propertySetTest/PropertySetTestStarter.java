package com.patagonia.propertySetTest;

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
@Import(AppConfig.class)
public class PropertySetTestStarter {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);

        Object myBean = context.getBean("productService");

        if (myBean instanceof ProductServiceImpl) {
            System.out.println("Main method returned: " + ((ProductServiceImpl)myBean).getData());
        }
    }
}
