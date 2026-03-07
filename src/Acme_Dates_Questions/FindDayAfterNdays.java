package Acme_Dates_Questions;

import java.util.Scanner;

public class FindDayAfterNdays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {
                "sunday","monday","tuesday","wednesday","thursday","friday","saturday"
        };

        System.out.println("Enter the Day : ");
        String today = sc.next();

        System.out.println("Enter number of days : ");
        int n = sc.nextInt();

        int index = -1;

        for(int i=0;i<7;i++){
            if(days[i].equalsIgnoreCase(today)){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Invalid days");
            return;
        }

        int result = (index + n ) % 7;

        System.out.println("Days after " + n + " days: " + days[result]);
    }
}
