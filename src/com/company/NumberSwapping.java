package com.company;

public class NumberSwapping {
    public static void main(String[] args) {
        //Method one
        int i=10;
        int j =20;
        /*int c=i;
        i=j;
        j=c;
        System.out.println(i +" "+ j);*/

       //Method 2
       /* i =i+j;
        j=i-j;
        i=i-j;
        System.out.println(i +" "+ j);*/

        //Method 3
     /*   i =i*j;
        j=i/j;
        i=i/j;
        System.out.println(i +" "+ j);*/

        //Method 4
j=i+j-(i=j);
        System.out.println(i +" "+ j);

    }
}
