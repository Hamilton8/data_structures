package com.wisemind8h.datastructure.queues.test;

import com.wisemind8h.datastructure.queues.Queue;

public class exerc01 {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(9);

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);

    }

}
