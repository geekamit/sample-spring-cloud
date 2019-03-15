package com.tree;

public class PrintRootToLeafPath {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);

        root.setLeftChild(new Node(2));
        root.setRightChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(4));
        root.getLeftChild().setRightChild(new Node(5));
        root.getRightChild().setRightChild(new Node(6));
        printRootToLeafPath(root, new Integer[3],0);
    }

    public static void printRootToLeafPath(Node<Integer> root, Integer[] path, int pathLen){
        if (root == null){
            return;
        }
        path[pathLen] = root.getData();
        pathLen++;
        if (root.getLeftChild() == null && root.getRightChild() == null){
            printPath(path);
        }else {
            printRootToLeafPath(root.getLeftChild(),path, pathLen);
            printRootToLeafPath(root.getRightChild(), path, pathLen);
        }
    }
    public static void printPath(Integer[] path){
        for (Integer element : path){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
