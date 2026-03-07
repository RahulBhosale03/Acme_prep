package Arrays;

public class ReverseArray {

    static void reverseArr(int []arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,4,1,7,6,9,8};
        for (int num : arr){
            System.out.print(num);
        }
        reverseArr(arr);
        System.out.println();

        for (int num : arr){
            System.out.print(num);
        }
    }
}
