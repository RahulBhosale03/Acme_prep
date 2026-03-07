package Acme_Dates_Questions;

import java.util.Scanner;

public class FindDayBeforeNDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = {
                "sunday","monday","tuesday","wednesday","thursday","friday","saturday"
        };

        System.out.println("Enter the day");
        String today = sc.next();

        System.out.println("Enter the number to add");
        int n = sc.nextInt();

        int index = -1;

        for(int i=0;i<7;i++){
            if(days[i].equalsIgnoreCase(today)){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Invalid day");
            return;
        }

        int result = (index-(n%7)+7)%7;
        System.out.println("Day before "+ n +" days " + days[result]);
        sc.close();
    }
}
