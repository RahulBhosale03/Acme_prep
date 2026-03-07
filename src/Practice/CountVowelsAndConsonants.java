package Practice;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "programming";
        int vowels = 0;
        int consonants = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch >='a' && ch <='z'){
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }

        System.out.print(vowels);
        System.out.println();
        System.out.print(consonants);
    }
}
