package Advanced_Pattern;

public class Pattern05 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            //space
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            //First half
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }

            //Second half

            for (int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
