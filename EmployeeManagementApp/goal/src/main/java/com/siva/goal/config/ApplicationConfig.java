package com.siva.goal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.siva.goal.converter.StringToGenderConverter;

@Configuration
@ComponentScan("com.siva.goal")
public class ApplicationConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToGenderConverter());
    }

    // For adding static contents with the help of Resouce Handeller.
    // @Override
    // public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // registry.addResourceHandler("/static/**").addResourceLocations("classpath:static/");
    // }

    // @Bean
    // public ThymeleafViewResolver thymeleafViewResolver() {
    // ThymeleafViewResolver bean = new ThymeleafViewResolver();
    // SpringResourceTemplateResolver springResourceTemplateResolver = new
    // SpringResourceTemplateResolver();
    // springResourceTemplateResolver.setPrefix("../webapp/WEB-INF/views/");
    // springResourceTemplateResolver.setSuffix(".html");
    // SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
    // springTemplateEngine.addTemplateResolver(springResourceTemplateResolver);
    // bean.setTemplateEngine(springTemplateEngine);
    // return bean;

    // }

}
