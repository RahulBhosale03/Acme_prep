package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {2,4,1,7,6,9,8};
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;

        for(int i=1;i< arr.length;i++){
            if (arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
     }
}
