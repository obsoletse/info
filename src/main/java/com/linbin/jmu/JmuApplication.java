package com.linbin.jmu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;


@Slf4j //开启日志的注解
@SpringBootApplication
public class JmuApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(JmuApplication.class, args);
        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        log.info("\n----------------------------------------------------------\n\t" +
                "Application info is running! Access URLs:\n\t" +
                "Local: http://localhost:" + port + path + "/\n\t" +
                "----------------------------------------------------------");
    }

}
