package com.ad.weibo.adinf;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserServiceTest {

    @Async
    public void executeAsyncTask(Integer n){
        try{
            Thread.sleep(1);
            System.out.println("ok");
        }catch(InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    @Async
    public void executeAsyncTaskPlus(Integer n){
        System.out.println("异步执行1"+n);
    }
}
