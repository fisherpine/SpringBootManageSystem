package com.ggbz.config;

import org.springframework.web.filter.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class MyCorsConfig {
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration configuration = new CorsConfiguration();
        //允许谁来异步访问
        configuration.addAllowedOrigin("http://localhost:8888");
        //是否允许发送Cookie信息
        configuration.setAllowCredentials(true);
        //允许哪些方法发过来postget...
        configuration.addAllowedMethod("*");
        // 4）允许的头信息
        configuration.addAllowedHeader("*");

        //添加映射路径，我们拦截一切请求
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",configuration);

        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}
