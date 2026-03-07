package ConversionQuestions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the decimal value : ");
        int num = sc.nextInt();


        int[] binary = new int[32];
        int i=0;

        while (num > 0){
            binary[i] = num % 2;
            num = num/2;
            i++;
        }

        System.out.println("Binary : ");
        for(int j=0;j<i-1;j++){
            System.out.print(binary[j]);
        }

        sc.close();
    }
}
