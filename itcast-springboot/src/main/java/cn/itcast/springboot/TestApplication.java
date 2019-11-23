package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * <code>TestApplication</code>
 * </p>
 * @author huiwang45@iflytek.com
 * @description  引导类springboot应用的入口
 * @date 2019/10/14 16:56
 */

@EnableAutoConfiguration // 启用springboot应用的自动配置
@ComponentScan  //类似于<context:component-scan base-package=""> 扫描该类所在的包，已经它的子子孙孙包
@SpringBootApplication // 使用组合注解 相当于EnableAutoConfiguration+ComponentScan+SpringBootConfiguration
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }
}
