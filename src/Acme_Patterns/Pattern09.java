package Acme_Patterns;

public class Pattern09 {
    public static void main(String[] args) {
        int n = 7;
        int num = 10;

        for(int i=1;i<=n;i++){
            int limit = (i == n)? i-1:i;
            for(int j=1;j<=limit;j++){
                if((i-2)%3 == 0){
                    System.out.print("* ");
                }else{
                    System.out.print(num+" ");
                    num+=10;
                }
            }
            System.out.println();
        }
    }
}
