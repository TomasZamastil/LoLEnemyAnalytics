package com.lea.lolenemyanalytics;

import org.springframework.boot.SpringApplication;

public class TestLoLEnemyAnalyticsApplication {

    public static void main(String[] args) {
        SpringApplication.from(LoLEnemyAnalyticsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
