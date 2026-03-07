package Practice;

import java.util.Scanner;

public class FindDayAfterNDays {

    static boolean isLeap(int year){
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    static boolean isValidDate(int day,int month ,int year){
        if(year < 0) return false;
        if(month < 1 || month > 12) return false;

        int[] monthDays = {
                31,28,31,30,31,30,
                31,31,30,31,30,31
        };

        if(isLeap(year)){
            monthDays[1] = 29;
        }

        if(day < 1 || day > month - 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day,month,year;

        while (true){
            System.out.println("Enter the day");
            day = sc.nextInt();

            System.out.println("Enter the month");
            month = sc.nextInt();

            System.out.println("Enter the year");
            year = sc.nextInt();

            if(isValidDate(day,month,year)){
                break;
            }else{
                System.out.println("Invalid date");
            }

            System.out.println("Enter the number days to  add");
            int n = sc.nextInt();

            if(n<0){
                System.out.println("Days cannot br negative");
            }

            int[] monthDay ={
                    31,28,31,30,31,30,
                    31,31,30,31,30,31
            };

            day+=n;

            while(true){
                if (isLeap(year))
                    monthDay[1] = 29;
                else
                    monthDay[1]= 28;

                if(day <= monthDay[month-1])
                    break;
            }



        }
    }
}
