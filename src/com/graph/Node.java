package com.graph;

import java.util.*;

public class Node {

    private int vertexNumber;
    private Set<Integer> adjacencySet = new HashSet<>();

    public Node(int vertexNumber){
        this.vertexNumber = vertexNumber;
    }

    public int getVertexNumber(){
        return this.vertexNumber;
    }
    public void addEdge(int vertexNumber){
        adjacencySet.add(vertexNumber);
    }

    public List<Integer> getAdjacentVertices() {
        List<Integer> adjacentVertices = new ArrayList<>(adjacencySet);
        Collections.sort(adjacentVertices);
        return adjacentVertices;
    }
}
