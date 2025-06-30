package org.example.Day01_datastructures;

public class MyQueue {
    private int[] arr = new int[100];
    private int front = 0, rear = 0;

    public void enqueue(int data) {
        arr[rear++] = data;
    }

    public int dequeue() {
        return arr[front++];
    }

    public boolean isEmpty() {
        return front == rear;
    }
}