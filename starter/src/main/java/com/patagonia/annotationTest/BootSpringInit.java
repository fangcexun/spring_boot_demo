package com.patagonia.annotationTest;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author xunfangce
 * @create 2025/3/6
 */
@Component
public class BootSpringInit implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BootSpringInit start loading bean...");
        List<Class<?>> classes = getClasses(BootSpringInit.class.getPackage().getName());
        List<Class<?>> annotatedClass = new ArrayList<>();
        classes.stream()
               .filter(v -> v.isAnnotationPresent(MyAnnotation.class))
               .forEach(annotatedClass::add);

        annotatedClass.forEach(v -> System.out.println(v.getAnnotation(MyAnnotation.class).annotationValue()));

        System.out.println(annotatedClass);
        System.out.println("BootSpringInit loading bean finished...");
    }

    public static List<Class<?>> getClasses(String packageName) throws IOException, ClassNotFoundException {
        String path = packageName.replace('.', '/');
        URL resource = Thread.currentThread().getContextClassLoader().getResource(path);
        File directory = new File(resource.getFile());

        List<Class<?>> classes = new ArrayList<>();
        if (directory.exists()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".class")) {
                    String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                    classes.add(Class.forName(className));
                } else if (file.isDirectory()) {
                    classes.addAll(getClasses(packageName + '.' + file.getName()));
                }
            }
        }
        return classes;
    }
}
