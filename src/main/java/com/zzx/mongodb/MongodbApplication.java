package com.zzx.mongodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Slf4j
@EnableAspectJAutoProxy
@SpringBootApplication
public class MongodbApplication {

    public static void main(String[] args) {
        log.info("项目开始启动！");
        SpringApplication.run(MongodbApplication.class, args);
    }

}
