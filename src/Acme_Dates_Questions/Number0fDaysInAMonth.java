package Acme_Dates_Questions;

import java.util.Scanner;

public class Number0fDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Month (1-12)");
        int month = sc.nextInt();

        System.out.println("Enter the Year");
        int year = sc.nextInt();

        int days = 0;

        if (month == 1 || month == 3 || month == 5 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                days = 29;
            else
                days = 28;
        }
        else
        {
            System.out.println("Invalid Month");
            return;
        }
        System.out.println("Number of days : " + days);

    }
}
