package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean // Define a bean for the Qualcomm Snapdragon 888 processor
    Processor snapdragon888() {
        var processor = new Processor();
        processor.setName("Qualcomm Snapdragon 888");
        return processor;
    }

    @Bean  // Define a bean for the Qualcomm Snapdragon 8 Gen 2 processor
    Processor snapdragon8Gen2() {
        var processor = new Processor();
        processor.setName("Qualcomm Snapdragon 8 Gen 2");
        return processor;
    }

    @Bean     // Define a primary bean for the Apple A16 Bionic processor
    @Primary
    Processor appleA16() {
        var processor = new Processor();
        processor.setName("Apple A16 Bionic");
        return processor;
    }

    @Bean
    Smartphone samsung() {
        var smartphone = new Smartphone();
        smartphone.setName("Samsung Galaxy S23");
        smartphone.setProcessor(snapdragon888());
        return smartphone;
    }

    @Bean
    Smartphone huawei() {
        var smartphone = new Smartphone();
        smartphone.setName("Huawei Nova Y70");
        smartphone.setProcessor(snapdragon888());
        return smartphone;
    }

    @Bean
    Smartphone iphone(@Autowired Processor processor) {
        var smartphone = new Smartphone();
        smartphone.setName("iPhone 14 Pro");
        smartphone.setProcessor(processor);
        return smartphone;
    }
}
