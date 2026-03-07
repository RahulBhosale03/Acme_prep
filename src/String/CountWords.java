package String;

import java.util.Locale;

public class CountWords {
    public static void main(String[] args) {
        String str = "programming is my hobby";
        int count = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' ' && (i==0 || str.charAt(i-1) == ' ')){
                count++;
            }
        }
        System.out.print("The count is : " + count);
    }
}
