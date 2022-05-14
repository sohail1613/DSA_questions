package com.company.Basic;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayType;
        String dayString;

        switch (day){
            case 1 : dayString = "Monday";
            break;
            case 2 : dayString = "Tuesday";
            break;
            case 3 : dayString = "Wednesday";
            break;
            case 4 : dayString = "Thursday";
            break;
            case 5 : dayString = " Friday";
            break;
            case 6 : dayString = "Saturday";
            break;
            case 7 : dayString = "Sunday";
            break;
            default: dayString = "Invalid day";
        }

        //Multiple cases without break
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: dayType = "Weekday";
            break;
            case 6:
            case 7: dayType = "Weekend";
            break;
            default: dayType = "Invalid input";
        }
        System.out.println(dayString+" is a "+dayType);
    }
}
