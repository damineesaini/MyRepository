package com.Collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques8 {
    public static void main(String[] args){
        Date date = new Date();
        //giving the format in which we need to print date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String stringDate = dateFormat.format(date);
        System.out.println("Today's date in the  format as example \"21-March-2016\"");
        System.out.println("\n\t"+stringDate);
    }
}
