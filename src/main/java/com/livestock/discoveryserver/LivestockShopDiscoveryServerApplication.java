package com.livestock.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LivestockShopDiscoveryServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(LivestockShopDiscoveryServerApplication.class, args);
  }
}
