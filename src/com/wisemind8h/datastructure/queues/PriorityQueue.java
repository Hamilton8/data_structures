package com.wisemind8h.datastructure.queues;

public class PriorityQueue<T> extends Queue<T>{
    public void enqueue(T element){
        Comparable<T> key = (Comparable<T>) element;

        int i;
        for (i = 0; i < elements.length; i++) {
            if (key.compareTo(elements[i] )> 0) {
                break;
            }
        }
        super.add(1,element);
    }
}
