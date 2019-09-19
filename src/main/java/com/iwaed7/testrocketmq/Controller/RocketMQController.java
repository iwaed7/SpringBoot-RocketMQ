package com.iwaed7.testrocketmq.Controller;

import com.iwaed7.testrocketmq.Producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 钱琦瑛
 * @Date 2019/9/19 2:16
 */
@RestController
@RequestMapping("/rocket")
public class RocketMQController {
    @Autowired
    private ProducerService producer;

    @RequestMapping("/push")
    public String pushMsg(String msg) {
        return producer.send("testTopic", "push", msg);
    }
}