package com.lrucache;

public class Node {
    int key;
    int value;
    Node pre;
    Node next;

    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
