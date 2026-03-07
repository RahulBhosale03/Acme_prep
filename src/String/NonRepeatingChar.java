package String;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "programming";

        for(int i=0;i<str.length();i++){
            boolean isRepeated = false;
            for(int j=0;j<str.length();j++){
                if( i != j && str.charAt(i) == str.charAt(j)){
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated){
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
