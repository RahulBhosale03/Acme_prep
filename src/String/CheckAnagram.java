package String;

public class CheckAnagram {
    public static void main(String[] args) {
        String str = "silent";
        String str2 = "listen";

        if (str.length() != str2.length()){
            System.out.println("Not anagram");
            return;
        }

        int [] count = new int[26];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        boolean isAnagram = false;

        for(int sum : count){
            if(sum == 0){
                isAnagram = true;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
