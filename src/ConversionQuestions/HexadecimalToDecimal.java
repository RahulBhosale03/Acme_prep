package ConversionQuestions;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Hexadecimal value : ");
        String hex = sc.next();

        int decimal = 0;
        int power = 0;

        for(int i=hex.length()-1;i>=0;i--){
            char ch = hex.charAt(i);
            int value;


            if(ch >='0' && ch <= '9'){
                value = ch - '0';
            }else{
                value = ch - 'A' + 10;
            }

            decimal += value * (int) Math.pow(16,power);
            power++;
        }

        System.out.println("Decimal value : "+decimal);
        sc.close();

    }
}
