package Acme_Patterns;
//        *
//        100 0
//        ***
//        300 400 500 600
//        *****
//        500 600 700 800 900 1000
public class Pattern02 {
    public static void main(String[] args) {
        int n=6;
        int num =100;
        int sum=0;

        for (int i=1;i<=n;i++){
             for (int j=1;j<=i;j++){
                 if (i%2 != 0){
                     System.out.print("*");
                 }else{
                     sum+=100;
                     if (sum > 100 && sum < 300){
                         System.out.print("0");
                     }else{
                         System.out.print(sum+" ");
                     }
                 }
             }
             sum = num*(i-1);
            System.out.println();
        }
    }
}
