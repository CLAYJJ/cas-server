package com.sso.cas.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
 *
 * cas server启动入口类
 * @Author luo jiajia
 * @Date 2018/6/9 0009 上午 10:38
 */
@SpringBootApplication
@MapperScan("com.sso.cas.server.mapper")
@ImportResource({"classpath:mybatis.xml","classpath:spring-dubbo.xml"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
