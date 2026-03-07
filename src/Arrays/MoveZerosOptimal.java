package Arrays;

public class MoveZerosOptimal {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,4,0,5};
        int n = arr.length;

        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
