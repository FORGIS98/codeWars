package com.mycompany.app;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> graphNodes = new ArrayList<>();

    public Graph() {
    }

    // It searches if the node exists, if it does not exist it creates it.
    // Then add the adjacency between the two.
    public void addNodePair(String dataOne, String dataTwo) {
        Node nodeOne = getNode(dataOne);
        if (nodeOne == null) {
            nodeOne = new Node(dataOne);
        }

        Node nodeTwo = getNode(dataTwo);
        if (nodeTwo == null) {
            nodeTwo = new Node(dataTwo);
        }

        graphNodes.add(nodeOne);
        graphNodes.add(nodeTwo);

        nodeOne.addAdjNode(nodeTwo);
        nodeTwo.addAdjNode(nodeOne);
    }

    public int getAllPaths() {

        Node start = getNode("start");
        Node end = getNode("end");

        return getAllPathsRecursive(start, end, new ArrayList<>(), 0);
    }

    private int getAllPathsRecursive(Node actual, Node end, ArrayList<Node> visited, int knownPaths) {

        if (actual.equals(end)) {
            return 1;
        }

        visited.add(actual);
        for (Node adj : actual.getAdjNode()) {
            if (!visited.contains(adj) || Character.isUpperCase(adj.getData().charAt(0))) {
                knownPaths += getAllPathsRecursive(adj, end, visited, knownPaths);
            }
        }

        return knownPaths;
    }

    private Node getNode(String data) {
        for (Node n : graphNodes) {
            if (n.getData().equals(data)) {
                return n;
            }
        }

        return null;
    }
}

class Node {
    String data;
    ArrayList<Node> adjacentNodes = new ArrayList<>();

    public Node(String data) {
        this.data = data;
    }

    protected void addAdjNode(Node n) {
        adjacentNodes.add(n);
    }

    protected ArrayList<Node> getAdjNode() {
        return adjacentNodes;
    }

    protected String getData() {
        return this.data;
    }

    @Override
    public boolean equals(Object n) {
        return this.getData().equals(((Node) n).getData());
    }
}