package cl.colocolo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ColoColoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColoColoEurekaApplication.class, args);
    }

}