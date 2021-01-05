package com.github.szsalyi.spring.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Szabolcs Salyi
 * @since 2021-01-05
 */

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
}
