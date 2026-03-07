package Practice;

public class MoveZeros {
    public static void main(String[] args) {
        int[]arr={1,0,2,0,3,0,4};
        int n = arr.length;

//        int j=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//        for(int num : arr){
//            System.out.print(num);
//        }

        int [] temp = new int[n];
        int index=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                temp[index++] = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                temp[index++] = 0;
            }
        }

        for(int num : temp){
            System.out.print(num);
        }
    }
}
