package Arrays;

public class ReplaceZerosWithNumber {
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,3,0,4};
        int replace = 5;

        for(int i=0;i< arr.length;i++){
            if(arr[i] == 0){
                arr[i] = replace;
            }
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
