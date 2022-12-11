package com.yacoding.dongbao.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author yaCoding
 * @create 2022-12-11 下午 2:27
 */
@SpringBootApplication
@MapperScan("com.yacoding.dongbao.ums.mapper")
public class YacodingDongbaoUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YacodingDongbaoUmsApplication.class,args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
