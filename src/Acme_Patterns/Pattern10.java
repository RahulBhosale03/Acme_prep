package Acme_Patterns;

public class Pattern10 {
    public static void main(String[] args) {

        int n = 7;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            // left spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first character
            if (i % 2 == 1) {
                System.out.print(num);
            } else {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // second character
            if (i > 1) {
                if (i % 2 == 1) {
                    System.out.print(num);
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();

            if (i % 2 == 1) {
                num++;
            }
        }

        num--; // adjust because last odd row already incremented

        for (int i = n - 1; i >= 1; i--) {

            // left spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first character
            if (i % 2 == 1) {
                num--;
                System.out.print(num);
            } else {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // second character
            if (i > 1) {
                if (i % 2 == 1) {
                    System.out.print(num);
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}