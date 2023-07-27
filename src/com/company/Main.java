package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long principle;
        double annualInterestRate;
        int years;


        while(true){
            System.out.print("Principle Amount($1K-$1M): ");
            principle = scanner.nextLong();
            if ((principle >=1000)&&(principle <=1000000)){
                break;
            }
            System.out.println("Enter a Value greater than 0 and less than or equal to 1,000,000.");
        }

        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextDouble();
            if ((annualInterestRate>=1)&&(annualInterestRate<=30)){
                break;
            }
            System.out.println("Enter a Value greater than 0 and less than or equal to 30.");
        }


        while(true){
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if ((years>=1)&&(years<=12)){
                break;
            }
            System.out.println("Enter a Value greater than 0 and less than or equal to 12.");
        }




        double monthlyIR = (annualInterestRate/(100*12));
        int noOfPayments= years*12;
        double upper= monthlyIR* Math.pow((1+monthlyIR),noOfPayments);
        double lower = Math.pow(1+monthlyIR,noOfPayments) - 1;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortage : "+  currency.format( principle *(upper/lower)));





    }
}
