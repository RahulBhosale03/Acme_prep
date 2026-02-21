package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_BF {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,4,5,5,5};
        Set<Integer> set = new HashSet<>();

        //Add element to the set
        for(int num : arr){
            set.add(num);
        }

        //Convert set back to array
        int [] result = new int[set.size()];
        int i = 0;

        for (int num : set){
            result[i++] = num;
        }
        System.out.println(Arrays.toString(result));
    }
}
