package com.zhangyuanming.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 业务服务主启动
 *
 * @author ZhangYuanMing
 * @create 2022-01-18 11:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(BusinessMain9001.class, args);
    }
}
