package Acme_Patterns;

//        10
//        * *
//        20 30 40
//        50 60 70 80
//        * * * * *
//        90 100 110 120 130 140
//        150 160 170 180 190 200 210
public class Pattern08 {
    public static void main(String[] args) {
        int n = 7;
        int num = 10;
        int sum = 0;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i-2)%3 == 0){
                    System.out.print("* ");
                }else{
                    System.out.print(num+" ");
                    num+=10;
                }
            }
            System.out.println();
//            sum = num*(i-1);
        }
    }
}
