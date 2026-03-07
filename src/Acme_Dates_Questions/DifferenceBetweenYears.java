package Acme_Dates_Questions;

import java.util.Scanner;

public class DifferenceBetweenYears {

    static boolean isLeap(int year){
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first year");
        int y1 = sc.nextInt();

        System.out.println("Enter second year");
        int y2 = sc.nextInt();

        int totalDays = 0;

        for(int year = y1 ; year < y2 ; year++){
            if (isLeap(year)){
                totalDays += 366;
            }else{
                totalDays += 365;
            }
        }

        System.out.println("Total days between years: "+totalDays);
        sc.close();
    }
}
