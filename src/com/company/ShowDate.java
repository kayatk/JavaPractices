package com.company;

import java.util.Date;

public class ShowDate {
    public static void main(String[] args) {
        //Create object of ShowDate class and call above method which should print dates
        ShowDate showDate =new ShowDate();
        showDate.showCurrentDate();
    }


    //Create 1 methods called showCurrentDate which print date
        public void showCurrentDate(){
            //Note - Use existing Date class in Java to get the date (you can use references)
            Date date =new Date();
            System.out.println(date);
        }
}
