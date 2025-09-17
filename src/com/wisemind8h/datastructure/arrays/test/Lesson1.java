package com.wisemind8h.datastructure.arrays.test;

import com.wisemind8h.datastructure.arrays.Arrays;

import java.util.ArrayList;

public class Lesson1 {
    public static void main(String[] args) {
        ArrayList<String> arrays = new ArrayList<>(5);
        arrays.add("a");
        arrays.add("b");
        arrays.add("c");
        arrays.add("a");
        System.out.println(arrays.lastIndexOf("a"));
    }
}
