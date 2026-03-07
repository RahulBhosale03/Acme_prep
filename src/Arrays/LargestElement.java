package Arrays;

public class LargestElement {
    public static void main(String[] args) {

//        int [] arr = {2,4,1,7,6,9,8};
        int [] arr = {0,0,0,0,0,1,0};
        int max = arr[0];

        for (int i=1;i< arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
