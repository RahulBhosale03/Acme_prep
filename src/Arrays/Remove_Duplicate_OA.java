package Arrays;

public class Remove_Duplicate_OA {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,4,5,5,5};

        int i=0;
        int n = arr.length;
        for(int j=1;j<n;j++){
            if (arr[i] != arr[j]){
                i++;
                arr[i]= arr[j];
            }
        }

        for (int k=0;k<=i;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
