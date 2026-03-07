package Practice;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,9,8};
        int large = arr[0];
        int secLarge = Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i] > large){
                secLarge = large;
                large = arr[i];
            } else if (arr[i] < large && arr[i] > secLarge) {
                secLarge = arr[i];
            }
        }
        System.out.println(secLarge);

    }
}
