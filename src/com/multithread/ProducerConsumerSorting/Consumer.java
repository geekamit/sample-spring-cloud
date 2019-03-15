package com.multithread;

public class Consumer implements Runnable {

    ProducerConsumerSorting pcSorting;

    public Consumer(ProducerConsumerSorting pcSorting){
        this.pcSorting = pcSorting;
    }

    @Override
    public void run() {
            System.out.println("Consumer Started");
            pcSorting.consumeAndSortList();
        }
    }
