package ConversionQuestions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary number");
        String binary = sc.next();


        int decimal = 0;
        int power = 0;

        for(int i=binary.length()-1;i>=0;i--){
            char ch = binary.charAt(i);

            int digit = ch - '0';

            decimal += digit * Math.pow(2,power);
            power++;
        }
        System.out.println("Decimal Number : " +decimal);
        sc.close();
    }
}
