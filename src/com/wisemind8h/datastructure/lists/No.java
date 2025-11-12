package com.wisemind8h.datastructure.lists;

public class No<T> {
    private T element;
    private No<T> next;

    public No(T element){
        this.element = element;
    }

    public No(T element, No<T> next){
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "No{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
