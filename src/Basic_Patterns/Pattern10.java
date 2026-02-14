package Basic_Patterns;

//    A
//    A B
//    A B C
//    A B C D
//    A B C D E
//    A B C D E F

public class Pattern10 {
    public static void main(String[] args) {
        int n =6;
        for (int i=0;i<n;i++){
            for (char ch='A';ch<='A' + i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
