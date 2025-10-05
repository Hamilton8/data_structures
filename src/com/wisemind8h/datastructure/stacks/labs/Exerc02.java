package com.wisemind8h.datastructure.stacks.labs;

import com.wisemind8h.datastructure.stacks.Stack;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> evens =  new Stack<>();
        Stack<Integer> odds = new Stack<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num == 0){
                try{
                    if (evens.pop() == null || odds.pop() == null){
                        System.out.println("ERROR!");
                    }
                } catch (RuntimeException e) {
                    System.out.println("Erro: "+e.getMessage());
                }

            } else if (num % 2 == 0) {
                evens.push(num);
            }else {
                odds.push(num);
            }
        }

        while(!evens.isEmpty()){
            System.out.print(evens.pop() +" ");
        }

        while(!odds.isEmpty()){
            System.out.print(odds.pop() +" ");
        }
    }
}
