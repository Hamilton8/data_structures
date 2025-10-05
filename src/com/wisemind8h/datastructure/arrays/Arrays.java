package com.wisemind8h.datastructure.arrays;

public class Arrays<T> {
    private T [] elements;
    private int size;

    public Arrays(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }
    public Arrays(){
 
    }
    public void add(T element){
        this.addCapacity();
        if (size<this.elements.length){
            this.elements[this.size] = element;
            size++;
            return;
        }
        throw new ArrayStoreException("The array is full!");
    }

    public T getElement(int position){
        if (!(position>=0 || position<this.size)){
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[position];
    }

    public boolean exists(String element){
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public int getPosition(String element){
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) return i;
        }
        return -1;
    }

    public boolean isFull(){
       return this.size==this.elements.length;
    }

    public boolean occupiedPosition(int index){
        return this.elements[index]!=null;
    }
    public boolean add(int index, T element){
        this.addCapacity();
        if (!(index>=0 && index<this.size)){
            throw new IndexOutOfBoundsException("The inputed index is not valid");
        }
        for (int i = this.size-1; i >= index; i--) {
            this.elements[i+1] = this.elements[i];
        }
        this.elements[index] = element;
        this.size++;
        return true;
    }

    private void addCapacity(){
        if (this.size == this.elements.length){
            T[] newElements = (T[]) (new Object[this.elements.length*2]);
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i]=this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void remove(int index){
        if (!(index>=0 || index<this.size)){
            throw new IndexOutOfBoundsException("Invalid position!");
        }
        for (int i = index; i < this.elements.length-1; i++) {
            this.elements[i] =this.elements[i+1];
        }
        size--;
    }

    public void remove(String element){
        int index= getPosition(element);
        if (index>-1){
            remove(index);
        }
    }

    public int lastIndexOf(String element){
        int last = -1;
        for (int i = this.size-1; i >= 0; i--) {
           if (this.elements[i].equals(element)){
               return i;
           }
        }
        return -1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size-1; i++) {
            sb.append(this.elements[i]);
            sb.append(", ");
        }

        if (this.size>0){
            sb.append(this.elements[this.size-1]);
        }
        sb.append("]");
        return sb.toString();
    }

    public int getSize(){
        return this.size;
    }

    public T[] getElements(){
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
