package com.QueueExamples;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(90);
        q.add(20);
        q.add(80);
        q.add(40);
        q.add(70);
        System.out.println("The queue is: " + q);
        int num1 = q.remove();
        System.out.println("The element deleted from the head is: " + num1);
        System.out.println("The queue after deletion is: " + q);
        int head = q.peek();
        System.out.println("The head of the queue is: " + head);
        int size = q.size();
        System.out.println("The size of the queue is: " + size);
    }
}