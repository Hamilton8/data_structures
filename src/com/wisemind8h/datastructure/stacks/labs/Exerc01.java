package com.wisemind8h.datastructure.stacks.labs;

import com.wisemind8h.datastructure.stacks.Stack;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number:");
            int num = input.nextInt();

            if (num%2==0){
                stack.push(num);
            }else {
                if (stack.pop()==null){
                    System.out.println("Empty stack!");
                }
            }
        }

        if (!stack.isEmpty()){
            for (int i = 0; i < stack.getSize(); i++) {
                System.out.print(stack.pop()+" ");
            }
        }
    }
}
