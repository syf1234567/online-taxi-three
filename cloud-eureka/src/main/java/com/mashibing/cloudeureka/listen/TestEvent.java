package com.mashibing.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.stereotype.Component;

import java.util.Timer;


@Component
public class TestEvent {

    public void listen(EurekaInstanceCanceledEvent event) {
        System.out.println("下限:" + event.getServerId());
        Timer timer = new Timer("ww");
    }
}
