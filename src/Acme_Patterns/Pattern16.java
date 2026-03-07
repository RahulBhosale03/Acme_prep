package Acme_Patterns;
//           10
//           *
//           10
//    10 * 10 * 10 * 10
//           10
//           *
//           10
public class Pattern16 {
    public static void main(String[] args) {
        int n=7;
        int mid = n/2;
        int num = 10;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i==mid){
                    if (j%2==0)
                        System.out.print(num+" ");
                    else
                        System.out.print("* ");


                } else if (j==mid) {
                    if(i%2==0)
                        System.out.print(num+" ");
                    else
                        System.out.print("* ");


                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
