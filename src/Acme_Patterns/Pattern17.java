package Acme_Patterns;
//              10
//              *
//              20
//       10 * 20 * 30 * 40
//              30
//              *
//              40
public class Pattern17 {
    public static void main(String[] args) {
        int n=7;
        int mid = n/2;

        int colNum = 10;
        int rowNum = 10;

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==mid) {
                    if (j%2 == 0){
                        System.out.print(colNum+" ");
                        colNum+=10;
                    }else{
                        System.out.print("* ");
                    }
                }else if(j==mid){
                    if (i%2 == 0){
                        System.out.print(rowNum+" ");
                        rowNum+=10;
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
