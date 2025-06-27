public class palindrome {
    public static  boolean isPalindrome(int x) {
        if(x < 0) return false;
        int original = x ;
        int reversed = 0 ;

        while(x > 0){
            int digit = x % 10 ;
            reversed = reversed * 10 + digit;
            x = x / 10 ;
        }

        return original == reversed;
    }
    public static void main(String args[]){
        int x = 121;
        boolean result = isPalindrome(x);
        if(result == true){
            System.out.println("true");
        }
        else{
            System.out.println("not a palindrome");
        }
    }

    
}
    
