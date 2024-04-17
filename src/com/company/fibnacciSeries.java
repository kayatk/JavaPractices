package com.company;

public class fibnacciSeries {
    public static void main(String[] args) {
      
        int fibseriesNo= 8;
        int  a=0;
        int b=1;
        int temp;
        for(int i=0;i<fibseriesNo;i++){
             System.out.print(a);
             temp =a;
             a=b;
             b=temp+b;
             
        }

        }
}
