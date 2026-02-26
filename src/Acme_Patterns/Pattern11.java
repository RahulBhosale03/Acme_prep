package Acme_Patterns;
//      10           10
//        *          *
//         30       30
//           *      *
//           50   50
//             *  *
//              60
//             *  *
//            50   50
//           *      *
//          30       30
//         *          *
//        10           10
public class Pattern11 {
    public static void main(String[] args) {
        int n = 13;
        int mid = (n+1)/2;

        for(int i=1;i<=n;i++){

            int step;
            if (i <= mid)
                step = i - 1;
            else
                step = n - i;

            if(step > 5) step = 5;

            int value = 10 + step * 10;

            for (int j=1;j<=n;j++){
                if (i==j || i+j == n+1){
                    if (i%2==0)
                        System.out.print("* ");
                    else
                        System.out.print(value);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
