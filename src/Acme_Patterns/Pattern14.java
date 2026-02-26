package Acme_Patterns;
//                         *
//                       * *
//                  30 20 10
//               60 50 40 30
//                 * * * * *
//               * * * * * *
//      80 70 60 50 40 30 20
// 110 100 90 80 70 60 50 40
public class Pattern14 {
    public static void main(String[] args) {
        int n = 8;

        for (int i=1;i<=n;i++){

            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
