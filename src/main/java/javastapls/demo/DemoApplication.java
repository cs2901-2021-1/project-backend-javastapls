package javastapls.demo;

import javastapls.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@ComponentScan({"javastapls.controller", "javastapls.business", "javastapls.config", "javastapls.exception", "javastapls.payload", "javastapls.security" , "javastapls.util"})
@EntityScan({"javastapls.data","javastapls.model"})
@EnableJpaRepositories("javastapls.data.repositories")
@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
