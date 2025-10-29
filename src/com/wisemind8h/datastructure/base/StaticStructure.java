package com.wisemind8h.datastructure.base;

public class  StaticStructure<T> {

    public T [] elements;
    private int size;

    public StaticStructure(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }
    public StaticStructure(){
        this(10);
    }
    protected boolean add(T element){
        this.addCapacity();
        if (size<this.elements.length){
            this.elements[this.size] = element;
            size++;
            return true;
        }
        return false;
    }

    protected boolean add(int index, T element){
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

    public void remove(int index){
        if (!(index>=0 || index<this.size)){
            throw new IndexOutOfBoundsException("Invalid position!");
        }
        for (int i = index; i < this.elements.length-1; i++) {
            this.elements[i] =this.elements[i+1];
        }
        size--;
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

    public boolean isEmpty(){
        return this.size==0;
    }

    public int getSize(){
        return this.size;
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

    public void remove(String element){
        int index= getPosition(element);
        if (index>-1){
            remove(index);
        }
    }

    public T getElement(int position){
        if (!(position>=0 || position<this.size)){
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[position];
    }

    public T[] getElements(){
        return this.elements;
    }
}
