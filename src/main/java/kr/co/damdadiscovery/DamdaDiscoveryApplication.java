package kr.co.damdadiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DamdaDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DamdaDiscoveryApplication.class, args);
    }

}
