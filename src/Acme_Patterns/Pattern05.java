package Acme_Patterns;

//        *
//        10 20
//        *  *  *
//        *  *  *  *
//        30 40 50 60 70
//        *  *  *  *  *  *
//        *  *  *  *  *  *  *

public class Pattern05 {
    public static void main(String[] args) {
        int n = 7;
        int num = 10;
        for (int i=1;i<=n;i++){
                if ((i - 2) % 3 == 0) {
                    for (int j=1;j<=i;j++){
                        System.out.print(num+" ");
                        num+=10;
                }
            }
                else {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*  ");
                    }
                }
            System.out.println();
        }
    }
}
