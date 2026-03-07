package Practice;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str = "madam";
        int left = 0 ;
        int right = str.length()-1;
        boolean ispalindrome = false;

        while(left < right){
            if(str.charAt(left) == str.charAt(right)){
                ispalindrome = true;
                break;
            }
            left++;
            right--;
        }
        if (ispalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
