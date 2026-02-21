package Acme_Patterns;
//        *
//        20 25
//        30 * *
//        40 45 50 55
//        50 * * * *
//        60 65 70 75 80 85
//        70 * * * * * *
public class Pattern03 {

    public static boolean isOdd(int n){
        if (n % 2 != 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int startval = 10;
//        int n =7;
        for (int i=1;i<=7;i++){
            int currentval = startval;

            // for odd numbers
            if (isOdd(i) == false){
                for (int j=1;j<=i;j++){
                    if (i==1){
                        System.out.print("* ");
                    }
                    System.out.print(currentval+" ");
                    currentval+=5;
                }
            }

            if (isOdd(i) == true){
                for (int j=1;j<=i;j++){
                    if (j==1 && i!=1){
                        System.out.print(currentval+" ");
                    }else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
            startval +=10;
        }
    }
}
