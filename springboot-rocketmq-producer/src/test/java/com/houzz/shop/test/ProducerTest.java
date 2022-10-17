package com.houzz.shop.test;

import com.houzz.shop.springboot.rocketmq.ProducerApplication;
import com.houzz.shop.springboot.rocketmq.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author HouZZ
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProducerApplication.class)
@Slf4j
public class ProducerTest {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    public void test1(){
        rocketMQTemplate.convertAndSend("SentinelTopicTest","hello springboot rocketmq1!");
        log.info("消息发送成功！"+ Constants.TEST_TOPIC_NAME);
    }

}
