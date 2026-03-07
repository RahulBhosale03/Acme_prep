package Arrays;

public class MoveZerosBrute {
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,4,0,5};
        int n = arr.length;

        int [] temp = new int[n];
        int index = 0;

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                temp[index++] = arr[i];
            }
        }

        while(index < n){
            temp[index++] = 0;
        }

        for (int num : temp ){
            System.out.print(num+" ");
        }
    }
}
