/*
 * 10. **Finding the Greatest Common Divisor (GCD)**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find the GCD of two numbers.  
    **Example**:  
    Input: `a = 48, b = 18`  
    Output: `6`  
    Explanation: The GCD of 48 and 18 is 6.
 */
import java.util.*;
public class question10 {
    public static int findGCD(int firNum , int secNum){
        int min =Math.min(firNum, secNum);
        while (min>0) {
            if(firNum%min==0 && secNum%min == 0){
                break;
            }
            min--;
        }
        return min;
    }
public static void main (String [] args){
 Scanner sc  = new Scanner(System.in);
 System.out.println("Enter first number");
 int a = sc.nextInt();
 System.out.println("Enter second  number");
 int b = sc.nextInt();
  System.out.println( "Greatest Common Divisor : "+findGCD(a, b));
sc.close();
}
    
}
