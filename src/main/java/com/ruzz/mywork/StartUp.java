package com.ruzz.mywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@Configuration
public class StartUp
{

        public static void main(String[] args) throws Exception
        { 
            /*SpringApplication application = new SpringApplication(startUp.class);
            application.run(args); */
            SpringApplication.run(StartUp.class, args);
        }
}
