package com.chetank.config;

/**
 * Created by chetan on 25/12/16.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//Annotating a class with the @Configuration indicates that the class c
// an be used by the Spring IoC container as a source of bean definitions.
@Configuration
@ComponentScan("com.chetank.service")
//// search the com.nexthoughts.spring.mvc.demo.services for @Component classes
//ComponentScan--->Configures component scanning directives for use with @Configuration classes.
// Provides support parallel with Spring XML's <context:component-scan> element.
public class SpringRootConfig {
}
