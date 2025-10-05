package com.wisemind8h.datastructure.stacks.test;

import com.wisemind8h.datastructure.stacks.Stack;

public class Test01 {
    public static void main(String[] args) {
        Stack<Integer> test = new Stack<>();
        test.push(1);
        Integer num = test.pop();
        System.out.println(num);
    }
}
