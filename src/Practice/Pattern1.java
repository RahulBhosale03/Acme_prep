package Practice;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 7;
        int startval = 10;

        for(int i=1;i<=n;i++){
            int currentVal = startval;
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print("*");
                }else if (i%2==0){
                    System.out.print(currentVal + " ");
                    currentVal+=5;
                }else{
                    if(j==1){
                        System.out.print(currentVal+" ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }
            startval+=10;
            System.out.println();
        }
    }
}
