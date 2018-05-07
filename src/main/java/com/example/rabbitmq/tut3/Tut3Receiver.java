package com.example.rabbitmq.tut3;

import com.example.rabbitmq.AbstractReciever;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class Tut3Receiver extends AbstractReciever {

    @RabbitListener(queues = "#{autoDeleteQueue1.name}")
    public void receive1(String in) throws InterruptedException {
        receive(in, 1);
    }

    @RabbitListener(queues = "#{autoDeleteQueue2.name}")
    public void receive2(String in) throws InterruptedException {
        receive(in, 2);
    }
    

}
