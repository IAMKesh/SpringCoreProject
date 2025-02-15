package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Smartphone samsung = context.getBean("samsung", Smartphone.class);
        Smartphone vivo = context.getBean("vivo", Smartphone.class);
        Smartphone iphone = context.getBean("iphone", Smartphone.class);

        System.out.println("Smartphone name: " + samsung.getName() + ". Processor: " + samsung.getProcessor().getName());
        System.out.println("Smartphone name: " + vivo.getName() + ". Processor: " + vivo.getProcessor().getName());
        System.out.println("Smartphone name: " + iphone.getName() + ". Processor: " + iphone.getProcessor().getName());
    }
}