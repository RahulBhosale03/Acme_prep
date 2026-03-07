package Acme_Dates_Questions;

import java.util.Scanner;

public class TotalSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of years : ");
        int n = sc.nextInt();

        int totalSundays = 52 * n;

        System.out.println("Total Sunday in " + n + " years : " + totalSundays);
        sc.close();
    }
}
