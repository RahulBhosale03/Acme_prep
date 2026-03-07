package Practice;

public class Pattern4 {
    public static void main(String[] args) {
        int n=7;
        int num =1;

        for(int i=1;i<=n;i++){

            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            if(i%2==0){
                System.out.print("*");
            }else{
                System.out.print(num);
            }

            //space
            for(int j=1;j<2*i-1;j++){
                System.out.print(" ");
            }

            if(i>1){
                if(i%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(num);
                }
            }
            System.out.println();
            if(i%2==1){
                num++;
            }
        }

        num--;
        for(int i=n-1;i>=1;i--){

            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            if(i%2==0){
                System.out.print("*");
            }else{
                num--;
                System.out.print(num);
            }

            //space
            for(int j=1;j<2*i-1;j++){
                System.out.print(" ");
            }

            if(i>1){
                if(i%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(num);
                }
            }
            System.out.println();

        }
    }
}
