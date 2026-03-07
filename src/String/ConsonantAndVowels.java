package String;

import java.util.HashSet;

public class ConsonantAndVowels {
    public static void main(String[] args) {
        String str = "Rahul Bhosale";
//        int vowels=0;
//        int consonants=0;
        str = str.toLowerCase();

        HashSet<Character> vowels = new HashSet<>();
        HashSet<Character> consonants = new HashSet<>();


        for(int i=0;i<str.length();i++){
            char ch  = str.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch == 'a'|| ch == 'e' || ch == 'i' || ch=='o'||ch=='u'){
                    vowels.add(ch);
                }else{
                    consonants.add(ch);
                }
            }
        }
        System.out.print("The count of the vowels : "+vowels.size());
        System.out.println();
        System.out.print("The count of the consonants : "+consonants.size());
    }
}
