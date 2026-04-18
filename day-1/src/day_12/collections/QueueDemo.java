package day_12.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
//        Last In First Out -> LIFO
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);


        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }

//    public static void main(String[] args) {
////        First In First Out -> FIFO
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue);
//    }
}
