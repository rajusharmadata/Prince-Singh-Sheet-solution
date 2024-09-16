/*
 *  **Identifying Palindromes**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, String Manipulation  
   **Description**: Write a program to check if a string or number is a palindrome.  
   **Example**:  
   Input: `string = "radar"`  
   Output: `Palindrome`  
   Explanation: "radar" reads the same backward as forward. 
 */

import java.util.*;

public class question6 {
    public static boolean StringPlandrom(String str){
        // take a empty string for the store new string
        String newStr="";

// optimze solution 
/*
 *             int i = 0;
            int j = str.length()-1;
            while (i<j) {
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
 */
           // brotforce
           
        for(int i = str.length()-1; 0<=i;i--){
            newStr = newStr + str.charAt(i);
        }
       // Checking if both the strings are equal
        if(str.equals(newStr)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(StringPlandrom(str)){
            System.err.println("planidrom");
        }else{
           System.err.println("not Planidrom");
        }

    }
}
