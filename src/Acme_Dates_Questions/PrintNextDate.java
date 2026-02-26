package Acme_Dates_Questions;

import java.util.Scanner;

public class PrintNextDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date : ");
        int date = sc.nextInt();

        System.out.println("Enter the month : ");
        int month = sc.nextInt();

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        int daysInMonth = 0;

        if(month == 1 || month == 3 || month == 5 || month ==7 ||
                month == 8 || month == 10 || month == 12){
            daysInMonth = 31;

        }else if (month == 4 || month == 6 || month == 9 || month == 11){
            daysInMonth = 30 ;

        }else if (month == 2){
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                daysInMonth = 29;
            }else{
                daysInMonth = 28;
            }
        }else {
            System.out.println("Invalid Month");
            return;
        }
        date++;
        if (date > daysInMonth){
            date = 1;
            month++;

            if (month > 12){
                month =1;
                year++;
            }
        }
        System.out.println("Next date : " + date +"/"+ month + "/"+year);
    }
}
