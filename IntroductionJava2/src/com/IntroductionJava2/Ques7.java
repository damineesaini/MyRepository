package com.IntroductionJava2;

import java.util.Scanner;

public class Ques7 {
    static void ConvertSecondsToDaysHoursMinutesSecs(int seconds)
    {
        int day = seconds / (24 * 3600);

        int hour = (seconds % (24*3600)) / 3600;

        int minutes = (seconds % 3600) / 60 ;

        int second = seconds % 60;

        System.out.println( day + " days " + hour + " hours " + minutes + " minutes " + second + " seconds ");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds to convert into days: ");
        try {
            int seconds = scan.nextInt();
            ConvertSecondsToDaysHoursMinutesSecs(seconds);
        }catch (NumberFormatException exception){
            exception.printStackTrace();
        }
    }
}
