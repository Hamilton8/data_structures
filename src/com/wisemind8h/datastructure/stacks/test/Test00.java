package com.wisemind8h.datastructure.stacks.test;

import com.wisemind8h.datastructure.stacks.Stack;

public class Test00 {
    public static void main(String[] args) {
        Stack<Integer> hsm = new Stack<>();
        System.out.println(hsm.pop());
        hsm.push(1);
        //System.out.println(hsm);
       hsm.push(2);
        hsm.push(9);
        hsm.push(0);
        System.out.println(hsm.pop());
        System.out.println(hsm.top());
    }

}
