package Practice;

import java.util.Scanner;

public class DiffBtwTwoDays {

    static boolean isLeap(int year){
        return (year % 400 == 0 || year % 4 ==0 && year % 100 != 0);
    }
    static int totalDays(int day,int month,int year){
        int total = day;

        for(int y=0;y<year;y++){
            if(isLeap(y)){
                total += 366;
            }else{
                total +=365;
            }
        }

        int[] monthDay = {
                31,28,31,30,31,30,
                31,31,30,31,30,31
        };

        if(isLeap(year)){
            monthDay[1] = 28;
        }

        for(int m=0;m<month-1;m++){
            total += monthDay[m];
        }

        return total;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter first date");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter second date");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();

        int total1 = totalDays(d1,m1,y1);
        int total2 = totalDays(d2,m2,y2);

        int diffrence = Math.abs(total1-total2);

        System.out.println("The total difference is :"+diffrence);
        sc.close();

    }
}
