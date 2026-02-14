package Arrays;

public class LargestElement {
    public static void main(String[] args) {
//        int [] arr = {10,20,4,99,15};
        int [] arr = {2,4,1,7,6,9,8};
        int max = arr[0];

        for (int i=1;i< arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
