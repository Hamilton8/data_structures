package com.wisemind8h.datastructure.queues;

import com.wisemind8h.datastructure.base.StaticStructure;

public class Queue<T> extends StaticStructure<T> {

    public Queue(int capacity){
        super(capacity);
    }

    public Queue(){super();}

    public void enqueue(T element){
        super.add(element);
    }

    public T peek(){
        if (super.isEmpty()){
            return null;
        }
        return super.elements[0];
    }

    public T dequeue(){

        if(this.isEmpty()){
            return null;
        }

        T peek = super.elements[0];
        super.remove(0);
        return peek;
    }
}
