package Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = {2,4,1,7,6,9,8};
        int min = arr[0];

        for (int i=1;i< arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
