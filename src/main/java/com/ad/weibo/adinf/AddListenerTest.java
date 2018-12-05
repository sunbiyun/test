package com.ad.weibo.adinf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class AddListenerTest implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    private UserServiceTest userService;

    @Autowired
    private KafkaConsumer kafkaConsumer;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//
//        userService.executeAsyncTask(2);
//        userService.executeAsyncTask(2);

        System.out.println("ffdfdfdf");
    }
}
