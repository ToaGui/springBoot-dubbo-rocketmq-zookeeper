package com.houzz.shop.springboot.rocketmq.listener;

import com.houzz.shop.springboot.rocketmq.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author HouZZ
 **/
@RocketMQMessageListener(topic = Constants.TEST_TOPIC_NAME,consumerGroup = "${rocketmq.consumer.group}")
@Component
@Slf4j
public class ConsumerListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("接收消息："+s);
    }
}
