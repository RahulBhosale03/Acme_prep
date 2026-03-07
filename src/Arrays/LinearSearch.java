package Arrays;

public class LinearSearch {

    static int linearSearch(int [] arr,int key){
        for (int i=0;i< arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {50,10,33,40,26};
        int key = 40;
        System.out.println("The Index value of the key is : "+linearSearch(arr,key));
    }
}
