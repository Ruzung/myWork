package ruzz.com.myWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class startUp extends WebMvcConfigurerAdapter
{

        public static void main(String[] args) throws Exception
        { 
            /*SpringApplication application = new SpringApplication(startUp.class);
            application.run(args); */
            SpringApplication.run(startUp.class, args);
        }
}
