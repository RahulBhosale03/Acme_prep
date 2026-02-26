package Basic_Dsa;

import java.util.Scanner;

public class Nth_fibonacci_number {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int a=0,b=1;

        for (int i=2;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println("Nth fibonacci = "+ b);
    }
}
