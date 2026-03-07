package Practice;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str1 = "rahul bhosale";
        String str2 = "";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != ' '){
                str2 += str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
