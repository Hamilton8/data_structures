package com.wisemind8h.datastructure.arrays.labs;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        double grossIncome,totalDeductions, netIncome;

        System.out.println("Enter employee name:");
        String name = input.nextLine();

        System.out.println("Enter Department Code: ");
        String dc = input.nextLine();

        System.out.println("Enter the number of hours worked:");
        int nHours = input.nextInt();

        System.out.println("Enter status code:");
        String statusCode = input.next();

        //calculate the gross income
        if (dc.equalsIgnoreCase("mis")){
            grossIncome = 500*nHours;
        } else if (dc.equalsIgnoreCase("mkt")) {
            grossIncome = 400*nHours;
        }else {
            grossIncome = 550*nHours;
        }

        //calculate total deductions
        if (statusCode.equalsIgnoreCase("hof")){
            totalDeductions = grossIncome*(0.1+0.05);
        } else if (statusCode.equalsIgnoreCase("swd")) {
            totalDeductions = grossIncome*(0.15+0.1);
        }else {
            totalDeductions = grossIncome*(0.2+0.15);
        }

        //calculate the net income
        netIncome = grossIncome - totalDeductions;

        System.out.printf("Gross salary is: %.2f",grossIncome);
        System.out.printf("\nTotal deduction is: %.2f",totalDeductions);
        System.out.printf("\nNet Salary is: %.2f",netIncome);
    }
}
