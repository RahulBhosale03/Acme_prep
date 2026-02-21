package Acme_Patterns;
//        *
//        100 200
//        * * *
//        300 400 500 600
//        * * * * *
//        700 800 900 1000 1100 1200
public class Pattern01 {
    public static void main(String[] args) {
        int n =6;
        int num = 100;

        for (int i=1;i<=n;i++){
            if (i % 2 != 0){
                for (int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for (int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num+=100;
                }
            }
            System.out.println();
        }
    }
}
