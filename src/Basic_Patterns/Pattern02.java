package Basic_Patterns;
//              *
//             ***
//            *****
//           *******
//          *********
//         ***********
//        *************

public class Pattern02 {
    public static void main(String[] args) {
        int n = 7;
        for (int i=0;i<n;i++){
            //For spacing
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //For Stars
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
