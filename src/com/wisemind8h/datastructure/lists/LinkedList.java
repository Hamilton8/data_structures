package com.wisemind8h.datastructure.lists;

public class LinkedList<T> {

    private No<T> first;
    private No<T> last;
    private int size=0;

    public void add(T element) {       //NO na Heap
        No<T> no = new No<T>(element); // first = x123
        if (this.size == 0){           // last = x123
            this.first = no;
        }else{
            this.last.setNext(no);
        }
        this.last = no;
        this.size++;
    }

//    public void add(T element, No<T> next){
//        first.setElement(element);
//        first.setNext(next);
//        this.size++;
//    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "start=" + first +
                '}';
    }
}
