package com.wisemind8h.datastructure.stacks;

import com.wisemind8h.datastructure.base.StaticStructure;

public class Stack<T> extends StaticStructure<T> {

    public Stack(){
        super();
    }

    public Stack(int capacity){
        super(capacity);
    }

    public void push(T element){
        super.add(element);
    }

    public T pop(){
        if (!isEmpty()){
            super.remove(this.getSize());
            return super.getElement(getSize());
        }
        throw new RuntimeException("The stack is empty!");
    }

    public T top(){
       if (!isEmpty()){
           return this.getElement(getSize()-1);
       }
       return null;
    }

}
