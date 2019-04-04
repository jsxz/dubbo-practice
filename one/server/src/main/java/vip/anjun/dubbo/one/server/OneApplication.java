package vip.anjun.dubbo.one.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.ImportResource;

/**
 * @author anjun
 * @date 2019-04-04 16:22
 */
@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml","classpath:spring/spring-dubbo.xml"})
@MapperScan(basePackages = "vip.anjun.dubbo.one.model.mapper")
public class OneApplication extends SpringBootServletInitializer {


    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OneApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(OneApplication.class, args);
    }

}
