package vip.anjun.dubbo.two.server;
/**
 * Created by Administrator on 2019/1/12.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer; //1.x版本

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; //2.x版本

import org.springframework.context.annotation.ImportResource;

/**
*@Author:anjun
 **/
@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml","classpath:spring/spring-dubbo.xml"})
@MapperScan(basePackages = "vip.anjun.dubbo.two.model.mapper")
public class TwoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TwoApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TwoApplication.class, args);
    }

}