package Acme_Patterns;
//        *
//        20 25
//        30 * *
//        40 45 50 55
//        50 * * * *
//        60 65 70 75 80 85
//        70 * * * * * *
public class Pattern03 {
    public static void main(String[] args) {
        int startval = 10;

        for(int i=1;i<=7;i++){

            int currentVal = startval;

            for (int j=1;j<=i;j++){

                if(i==1){
                    System.out.print("*");
                } else if (i%2==0) {
                    System.out.print(currentVal+" ");
                    currentVal+=5;
                }
                else{
                    if(j==1){
                        System.out.print(currentVal+" ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }
            startval+=10;
            System.out.println();

        }
    }
}
