package com.wisemind8h.datastructure.arrays;

public class Arrays {
    private String[] elements;
    private int size;

    public Arrays(int capacity){
        this.elements = new String[capacity];
        this.size = 0;
    }

    public void add(String element)throws Exception{
        if (size<this.elements.length){
            this.elements[this.size] = element;
            size++;
            return;
        }
        throw new ArrayStoreException("The array is full!");
    }


    public String[] getElements(){
        return this.elements;
    }

    /*public void add(String element){
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i]==null){
                this.elements[i]=element;
                return;
            }
        }
    }*/
}
