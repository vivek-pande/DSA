/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase 
letters and removing all non-alphanumeric characters, it reads the same forward
 and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

 */


public class Valid_palindrome{

    public static void main (String[] args){

        String s ="A man, a plan, a canal: Panama";
       int i =0;
       int j=s.length()-1 ;
       while(i<j){ 
        char left = s.charAt(i);
        char right=s.charAt(j);
        
        if(!Character.isLetterOrDigit(left)  ){
            i=i+1;
            continue;
        }
        if(!Character.isLetterOrDigit(right)  ){
            j=j-1;
            continue;
        }
        if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
            System.out.println(left);
            System.out.println(right);
            System.out.println("palindrome nhi h");

            
        }

        i=i+1;
        j=j-1;
        
       }

       System.out.println("palindrome h");

        

    }
}