package com.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        List<List<Integer>> unsortedList = new ArrayList<>(500);
        List<List<Integer>> sortedList = new ArrayList<>(500);

        ProducerConsumerSorting producerConsumerSorting = new ProducerConsumerSorting(unsortedList,sortedList);
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i=0; i<5; i++){
            Producer producer = new Producer(producerConsumerSorting);
            Consumer consumer = new Consumer(producerConsumerSorting);
            pool.execute(producer);
            pool.execute(consumer);
        }

        try {
            pool.awaitTermination(10, TimeUnit.SECONDS);
            pool.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sorted List are");
        for (List<Integer> list : sortedList){
            System.out.println(list);
        }
    }
}
