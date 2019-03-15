package com.multithread;

import java.util.*;

public class ProducerConsumerSorting {

    private List<List<Integer>> unsortedList;
    private List<List<Integer>> sortedList;
    private Boolean itemConsumed = false;
    private Integer listIndex;

    ProducerConsumerSorting(List<List<Integer>> unsortedList, List<List<Integer>> sortedList){
        this.unsortedList = unsortedList;
        this.sortedList = sortedList;
    }

    public void addRandomNumber(int listIndex, List<Integer> list) {
        synchronized (this) {
            this.listIndex = listIndex;
            this.unsortedList.add(listIndex, list);
            itemConsumed = false;
            notifyAll();
        }
    }

    public void consumeAndSortList(){
        while (true) {
        synchronized (this){
                while (itemConsumed) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                if(null != listIndex) {
                    List<Integer> listToBeSorted = unsortedList.get(listIndex);
                    System.out.println("Consumer Thread List being sorted is "+Thread.currentThread().getName() +listToBeSorted);
                    Collections.sort(listToBeSorted);
                    System.out.println("Sorted List is " +listToBeSorted);
                    sortedList.add(listToBeSorted);
                    itemConsumed = true;
                    notifyAll();
                }
            }
        }
    }
}
