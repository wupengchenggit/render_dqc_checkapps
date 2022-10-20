package com.render.render_dqc_checkapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RenderDqcCheckappsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenderDqcCheckappsApplication.class, args);
    }

}
