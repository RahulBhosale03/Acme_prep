package Arrays;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[]arr= {1,2,3,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.print("The frequency of " +key+" is " + count);
    }
}
