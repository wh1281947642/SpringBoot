package cn.itcast.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * <p>
 * <code>JdbcConfigguration</code>
 * </p>
 * @author huiwang45@iflytek.com
 * @description
 * @date 2019/10/14 17:24
 */
@Configuration //声明一个类是一个java配置类，相当于一个xml配置文件
//@PropertySource("classpath:jdbc.properties") //读取资源文件
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfigguration {

    @Autowired //方式一 通过Autowired注入JdbcProperties
    private JdbcProperties jdbcProperties;


  /*  方式二 通过构造方法注入JdbcProperties
     public JdbcConfigguration(JdbcProperties jdbcProperties){

        this.jdbcProperties=jdbcProperties;
    }
*/
    /*@Value("${spring.datasource.utore.jdbc-url}")
    private String url;
    @Value("${spring.datasource.utore.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.utore.username}")
    private String username;
    @Value("${spring.datasource.utore.password}")
    private String password;*/

    //方式三 通过形参
   /* @Bean //把方法的返回值注入到spring容器
    DataSource dataSource(JdbcProperties jdbcProperties){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        druidDataSource.setUrl(jdbcProperties.getUrl());
        druidDataSource.setUsername(jdbcProperties.getUsername());
        druidDataSource.setPassword(jdbcProperties.getPassword());
        return  druidDataSource;
    }*/

   //方式四
   /* @Bean //把方法的返回值注入到spring容器
    @ConfigurationProperties(prefix = "spring.datasource.utore")
    DataSource dataSource1(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return  druidDataSource;
    }*/

    @Bean //把方法的返回值注入到spring容器
    DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        druidDataSource.setUrl(this.jdbcProperties.getUrl());
        druidDataSource.setUsername(this.jdbcProperties.getUsername());
        druidDataSource.setPassword(this.jdbcProperties.getPassword());
        return  druidDataSource;
    }
}
