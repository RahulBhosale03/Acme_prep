package Basic_Dsa;

public class Factorial_using_recurssion {

    static long fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
    return n*fact(n-1);
    }
    public static void main(String[] args) {
        int num  =5;
        System.out.println("Factorial : " + fact(num));
    }
}
