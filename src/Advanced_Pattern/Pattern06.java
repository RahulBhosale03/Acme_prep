package Advanced_Pattern;
//        *
//        25 *
//        * 30 *
//        35 *35 *
//        * 40 * 40 *

public class Pattern06 {
    public static void main(String[] args) {
        int n = 5;
        int num = 20;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){

                //Odd rows -> * num * num
                if (i % 2 != 0){
                    if (j % 2 != 0)
                        System.out.print("* ");
                    else
                        System.out.print(num + " ");
                }
                else {
                    if(j % 2 != 0)
                        System.out.print(num + " ");
                    else
                        System.out.print("*");

                }
            }
            num += 5;
            System.out.println();
        }
    }
}
