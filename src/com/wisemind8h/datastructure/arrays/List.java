package com.wisemind8h.datastructure.arrays;

import com.wisemind8h.datastructure.base.StaticStructure;

public class List<T> extends StaticStructure<T> {
    public List(){
        super();
    }
    public List(int capacity){
        super(capacity);
    }

    public boolean add(T element){
        return super.add(element);
    }

    public boolean add(int index, T element){
        return super.add(index,element);
    }


}
