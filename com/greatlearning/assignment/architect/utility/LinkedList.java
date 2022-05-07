package com.greatlearning.assignment.architect.utility;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {}

    public void insert(int data) {
        if (head == null) {
            head = tail = new Node(data);
            return;
        }
        tail.next = new Node(data);
        tail = tail.next;
    }

    public String toString() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}