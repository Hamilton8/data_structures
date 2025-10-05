package com.wisemind8h.datastructure.arrays.test;

import com.wisemind8h.datastructure.arrays.Arrays;
import com.wisemind8h.datastructure.arrays.List;

public class Test01 {
    public static void main(String[] args) {
        Arrays<String> arrays = new Arrays<>(10);
        try {
            arrays.add("Element 01");
            arrays.add("Element 02");
            arrays.add("Element 03");
        } catch (Exception e) {
           e.printStackTrace();
        }

        List<String> list = new List<>();
        list.add("Guirrugo");
        arrays.remove("Element 01");
        System.out.println(arrays);
    }
}
