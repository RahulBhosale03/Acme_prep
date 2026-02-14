package Arrays;

public class CheckSortedOrNot {

    public static boolean isSorted(int []arr,int n){
        for (int i=1;i<n;i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,1,7,6,9,8};
        int n = arr.length;
        System.out.println(isSorted(arr,n));
    }
}
