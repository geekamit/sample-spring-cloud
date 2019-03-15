package com.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Producer implements Runnable{

    private ProducerConsumerSorting pcSorting;
    private Random randomNumber = new Random();

    public Producer(ProducerConsumerSorting pcSorting){
        this.pcSorting = pcSorting;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            int counter = 0;
            List<Integer> randomList = new ArrayList<>();
            while (counter++ < 10) {
                int val = randomNumber.nextInt(99);
                randomList.add(val);
            }
            System.out.println("Produced list is "+randomList);
            pcSorting.addRandomNumber(i,randomList);
        }

    }
}
