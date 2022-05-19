package com.mycompany.app;

import java.util.Arrays;

public class IonFlucRelabeling {
    public static void main(String[] args) {
        System.out.printf("Test 1: %s\n",
                Arrays.equals(new int[] { 21, 15, 29 }, solution(5, new int[] { 19, 14, 28 })));

        System.out.printf("Test 2: %s\n",
                Arrays.equals(new int[] { 9, 9, 10, 14, 15 }, solution(4, new int[] { 1, 2, 3, 11, 14 })));

        System.out.printf("Test 3: %s\n",
                Arrays.equals(new int[] { -1, 7, 6, 3 }, solution(3, new int[] { 7, 3, 5, 1 })));
    }

    public static int[] solution(int h, int[] q) {
        return new int[] {};
    }

    private class Node {
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        private int data;

        Node(Node parent, int data) {
            this.parent = parent;
            this.data = data;
        }

        Node getParent() {
            return parent;
        }

        int getData() {
            return data;
        }

        void setLeftChild(Node left) {
            leftChild = left;
        }

        void setRightChild(Node right) {
            rightChild = right;
        }
    }

    private class Tree {
        Node[] tree;

        Tree(int height) {
            tree = new Node[Math.pow(2.0, Double.valueOf(height)) - 1.0];
        }
    }

}
