package cn.itcast.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * <p>
 * <code>JdbcProperties</code>
 * </p>
 * @author huiwang45@iflytek.com
 * @description
 * @date 2019/10/15 14:13
 */
@ConfigurationProperties(prefix = "spring.datasource.utore")
public class JdbcProperties {

    /**
     *
     */
    private String url;
    /**
     *
     */
    private String driverClassName;
    /**
     *
     */
    private String username;
    /**
     *
     */
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
