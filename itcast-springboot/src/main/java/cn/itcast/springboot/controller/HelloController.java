package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

import javax.sql.DataSource;

/**
 * <p>
 * <code>HelloController</code>
 * </p>
 * @author huiwang45@iflytek.com
 * @description
 * @date 2019/10/14 14:50
 */

@RestController
@RequestMapping("hello")
@EnableAutoConfiguration //启动自动配置
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public  String test(){
        return "hello springboot 1";
    }

}
