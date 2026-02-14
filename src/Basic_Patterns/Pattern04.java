package Basic_Patterns;
//        0
//        10
//        010
//        1010

public class Pattern04 {
    public static void main(String[] args) {
        int n=5;
        int start =  1;
        for (int i=0;i<n;i++){
            if (i % 2 == 0)start = 1;
            else start = 0;
            for (int j=0;j<i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
