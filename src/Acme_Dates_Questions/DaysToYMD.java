package Acme_Dates_Questions;

import java.util.Scanner;

public class DaysToYMD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total days : ");
        int day = sc.nextInt();

        int year = day/365;
        day = day % 365;

        int month = day/30;
        day = day % 30;

        System.out.println("Year : "+ year);
        System.out.println("Month : "+month);
        System.out.println("Days : "+day);

        sc.close();


    }
}
