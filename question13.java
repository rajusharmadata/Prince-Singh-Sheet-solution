/*
 * 13. **Reversing a String**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to reverse a given string.  
    **Example**:  
    Input: `string = "programming"`  
    Output: `"gnimmargorp"`  
    Explanation: The reversed string of "programming" is "gnimmargorp".  
 */
import java.util.*;
public class question13 {
public static String revrseString(String str){
   String  newstr= "";
   for(int i = str.length()-1;0<=i;i--){
    newstr+= str.charAt(i);
   }
   return newstr;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(revrseString(str));
        sc.close();
    }
}