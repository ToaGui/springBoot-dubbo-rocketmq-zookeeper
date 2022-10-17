package com.houzz.shop.springboot.rocketmq;

import com.houzz.shop.springboot.rocketmq.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HouZZ
 **/
@Slf4j
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
        log.info("消费者启动成功！"+ Constants.TEST_TOPIC_NAME);
    }
}
