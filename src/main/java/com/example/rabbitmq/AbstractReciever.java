package com.example.rabbitmq;

import org.springframework.util.StopWatch;

public abstract class AbstractReciever {
    protected void receive(String in, int receiver) throws InterruptedException {
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.println("instance " + receiver + " [x] Received '" + in + "'");
        doWork(in);
        watch.stop();
        System.out.println("instance " + receiver + " [x] Done in " +
                watch.getTotalTimeSeconds() + "s");
    }

    protected abstract void doWork(String in) throws InterruptedException;
}
