package com.heap;

import java.lang.reflect.Array;

public class Heap2<T> {
    private T[] array;
    private static int MAX_SIZE = 40;
    private int count=0;

    public Heap2(Class<T> clazz){
        this(clazz,MAX_SIZE);
    }

    public Heap2(Class<T> clazz, int size){
        array = (T[]) Array.newInstance(clazz, size);
    }
}
