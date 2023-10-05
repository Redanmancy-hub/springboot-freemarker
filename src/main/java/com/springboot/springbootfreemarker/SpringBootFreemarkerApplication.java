package com.springboot.springbootfreemarker;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootFreemarkerApplication {

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        SpringApplication.run(SpringBootFreemarkerApplication.class, args);
        stopwatch.stop();
        log.info("项目启动耗时:{}s",stopwatch.elapsed().getSeconds());
    }

}
