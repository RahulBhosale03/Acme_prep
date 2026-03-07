package Practice;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 9;
        int mid = (n+1)/2;
        int num = 3;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==j || i+j==n+1){
                    if(i%2 != 0){
                        System.out.print(num);
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            if (i%2==0){
                if(i<mid){
                    num--;
                }else{
                    num++;
                }
            }
            System.out.println();
        }
    }
}
