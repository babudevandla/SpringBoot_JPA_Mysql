package com.springbootcrudexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.springbootcrudexample.repository")
public class JpaConfig {

}
