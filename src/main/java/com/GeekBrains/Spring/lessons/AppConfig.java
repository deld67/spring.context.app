package com.geekbrains.spring.lessons;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.geekbrains.spring.lesson1"})
public class AppConfig {

}
