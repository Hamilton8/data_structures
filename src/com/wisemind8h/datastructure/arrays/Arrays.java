package com.wisemind8h.datastructure.arrays;

public class Arrays {
    private String[] elements;

    public Arrays(int capacity){
        this.elements = new String[capacity];
    }

    public void add(String element){
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i]==null){
                this.elements[i]=element;
                return;
            }
        }
    }

}
