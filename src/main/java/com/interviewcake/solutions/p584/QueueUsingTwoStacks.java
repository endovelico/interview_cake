package com.interviewcake.solutions.p584;

import java.util.Stack;

class QueueUsingTwoStacks {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    // Enqueue element x to the end of queue
    public void enqueue(int x) {
        in.push(x);
    }

    // Dequeue element from front of queue
    public int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop()); // Reverse order
            }
        }
        if (out.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return out.pop();
    }

    // Peek front element
    public int front() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return out.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.front());   // 1
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.empty());   // false
    }
}
