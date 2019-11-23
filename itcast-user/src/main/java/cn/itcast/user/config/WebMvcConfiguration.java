package cn.itcast.user.config;

import cn.itcast.user.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 * 1.声明该类是一个java配置类
 * 2.实现WebMvcConfigurer接口
 *
 * @author huiwang45@iflytek.com
 * @description
 * @date 2019/10/15 19:40
 */

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");

    }
}
