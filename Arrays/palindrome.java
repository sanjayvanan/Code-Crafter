import java.util.*;
class palindrome{
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println( palindromes(str));
    }

    public static Boolean palindromes(String palindromeornot ){
        
        int left = 0;
        int right = palindromeornot.length()-1;
    
        while(left<right){
            if(palindromeornot.charAt(left)!= palindromeornot.charAt(right)){
                return false;
            }            
            left++;
            right--;
        }
        return true;


     
    }
}