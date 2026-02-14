package Advanced_Pattern;
//        *       *
//        **     **
//        ***   ***
//        **** ****
//        **** ****
//        ***   ***
//        **     **
//        *       *
public class Pattern01 {
    public static void main(String[] args) {
        int n= 4;

        //Upper Half
        for (int i=0;i<n;i++){

            //For stars
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            //Space
            for (int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower half

        for (int i=n-1;i>=0;i--){
            //For stars
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            //Space
            for (int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
