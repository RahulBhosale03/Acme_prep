package Practice;

public class Practice02 {
    public static void main(String[] args) {
        int n=13;
        int mid = (n+1)/2;
        int num = 10;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    if(i%2==1){
                        System.out.print(num);
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i%2 == 1){
                if(i<mid){
                    num+=10;
                }else{
                    num-=10;
                }
            }
        }
    }
}
