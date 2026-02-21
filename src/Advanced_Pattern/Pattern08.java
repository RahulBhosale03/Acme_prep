package Advanced_Pattern;
//            1
//           1 2
//          1 2 3
//        1 2 3 4 5
//      1 2 3 4 5 6 7
public class Pattern08 {
    public static void main(String[] args) {
         int n =5;
         int count =1;
         for(int i=0;i<n;i++){
             for(int j=0;j<n-i;j++){
                 System.out.print(" ");
             }

             int start =1;

             for (int j=0;j<count;j++){
                 System.out.print(start+" ");
                 start++;
             }
             System.out.println();
             if (i<2){
                 count++;
             }else{
                 count+=2;
             }
         }
    }
}
