package com.atguigu.ssyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 权限管理模块启动类
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启微服务发现功能，可对接Nacos，Zookeeper等
// 扫描其他包中的组件，扫描逻辑为扫描当前包及其子包，本包为com.atguigu.ssyx，因此在该目录下的都可以扫描到
@ComponentScan("com.atguigu")
public class ServiceAclApplication {

    public static void main(String[] args) {
        // 返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(ServiceAclApplication.class, args);

        // 查看容器内的组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println("容器组件: " + name);
//        }
    }
}
