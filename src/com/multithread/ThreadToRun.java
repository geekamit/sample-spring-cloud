package com.multithread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadToRun implements Runnable {
    List<Integer> list;
    private int[] array;

    public ThreadToRun(int[] array, List<Integer> list) {
        this.array = array;
        this.list = list;
    }

    public void run() {
        for (int array : array) {
            list.add(array);
        }
    }
}


