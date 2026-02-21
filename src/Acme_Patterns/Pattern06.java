package Acme_Patterns;
//       3       3
//        *     *
//         2   2
//          * *
//           1
//          * *
//         2   2
//        *     *
//       3       3
public class Pattern06 {
    public static void main(String[] args) {
        int n = 9 ;
        int mid = (n+1)/2;
        int num =3;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                //Logic for print X
                if (i==j || i+j == n+1){
                    if (i % 2 == 0){
                        System.out.print("*");
                    }else{
                        System.out.print(num);
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

            if(i<mid && i%2==0){
                num--;
            }else if(i>mid && i%2==0){
                num++;
            }
        }
    }
}
