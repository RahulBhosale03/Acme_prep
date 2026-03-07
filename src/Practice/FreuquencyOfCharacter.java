package Practice;

import java.util.HashMap;

public class FreuquencyOfCharacter {
    public static void main(String[] args) {
        String str = "programming";

//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for (int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        System.out.println(map);
//    }


        for (int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            boolean alreadyPrinted = false;

            for(int k=0;k<i;k++){
                if(str.charAt(i) == str.charAt(k)){
                    alreadyPrinted = true;
                    break;
                }
            }
            if(!alreadyPrinted){
                System.out.println(str.charAt(i) +"="+count);
            }
        }
    }
}
