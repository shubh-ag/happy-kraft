package com.happy.kraft;

import com.happy.kraft.config.HappyKraftApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({HappyKraftApplicationConfig.class})
@SpringBootApplication
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}
