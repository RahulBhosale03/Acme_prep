package Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int [] arr = {1,4,2,7,6,9,8};
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;

        for (int i=1;i< arr.length;i++){
            if (arr[i] < smallest){
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        System.out.println(secSmallest);
    }
}
