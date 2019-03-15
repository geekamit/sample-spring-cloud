package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrder {

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);

        root.setLeftChild(new Node(2));
        root.setRightChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(4));
        root.getLeftChild().setRightChild(new Node(5));
        root.getRightChild().setRightChild(new Node(6));

        printOrderLevelRecursive(root);
    }

    static void printOrderLevel(Node root){
        if(root == null)
            return;

        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while (true) {

            int nodeCount = queue.size();
            if (nodeCount == 0) break;

            while (nodeCount > 0) {
                Node nextNode = queue.peek();
                System.out.print(nextNode.getData() +" ");
                queue.remove();

                if (nextNode.getLeftChild() != null) {
                    queue.add(nextNode.getLeftChild());
                }
                if (nextNode.getRightChild() != null) {
                    queue.add(nextNode.getRightChild());
                }
                nodeCount--;
            }
            System.out.println();
        }
    }

    public static void printOrderLevelRecursive(Node root){
        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node temp = queue.remove();
            if (temp != null)
                System.out.print(temp.getData()+" ");

            if (temp == null){
                System.out.println();

                if (!queue.isEmpty())
                    queue.add(null);
            }

            if (temp != null && temp.getLeftChild() != null){
                queue.add(temp.getLeftChild());
            }
            if (temp != null && temp.getRightChild() != null){
                queue.add(temp.getRightChild());
            }



        }

    }

}


