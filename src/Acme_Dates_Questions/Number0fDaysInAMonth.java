package Acme_Dates_Questions;

import java.util.Scanner;

public class Number0fDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Month (1-12) : ");
        int month = sc.nextInt();

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        int days = 0;

        for(int i=0;i<12;i++){
            if(i == month -1){
                days = daysInMonth[i];
                break;
            }
        }

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            days = 29;
        }

        System.out.println("Number of days : "+ days);
        sc.close();

    }
}
