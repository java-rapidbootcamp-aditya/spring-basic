package com.rapidtech.srpingdasar.lifeCycle;

import org.springframework.context.annotation.Bean;

public class LifeCycleConfiguration {
    @Bean
    public Connection connection() {
        return new Connection();
    }


    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server() {
        return new Server();
    }
}