package org.example.Day01_datastructures;

public class MyStack {
    private int[] arr = new int[100];
    private int top = -1;

    public void push(int data) {
        arr[++top] = data;
    }

    public int pop() {
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Q: 스택이 꽉 찼을 때는 어떻게 해야 하는가?
    public void push1(int data) {
        if(top >= 99) {
            throw new RuntimeException("Stack OverFlow!");
        }
        arr[++top] = data;
    }

    // Q: 빈 스택에서 pop하면 어떻게 해야 하는가?
    public int pop1() {
        if (isEmpty()) {
           throw new RuntimeException("Stack UnderFlow!");
        }
        return arr[top--];
    }
}