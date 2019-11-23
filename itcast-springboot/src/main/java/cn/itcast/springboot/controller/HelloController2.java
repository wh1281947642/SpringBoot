package cn.itcast.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <code>HelloController</code>
 * </p>
 * @author huiwang45@iflytek.com
 * @description
 * @date 2019/10/14 14:50
 */

@RestController
@RequestMapping("hello2")
@EnableAutoConfiguration //启动自动配置
public class HelloController2 {

    @GetMapping("show2")
    public  String test(){
        return "hello springboot 2";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController2.class,args);
    }
}
