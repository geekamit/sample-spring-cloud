package com.tree;

public class Node<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T data){
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}
