package study.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootJpaWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaWebappApplication.class, args);
    }
}
