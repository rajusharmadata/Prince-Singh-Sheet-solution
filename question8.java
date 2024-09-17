/*
 * **Finding the Factorial of a Number**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to compute the factorial of a given number.  
   **Example**:  
   Input: `number = 5`  
   Output: `120`  
   Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.  

 */
import java.util.*;
public class question8 {
    public static long findFactorial(long n){
        long fact = 1;
    for(long i = n;0<i;i--){
        fact = fact*i;
    }
    return fact;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        long n = sc.nextLong();
        System.err.println(findFactorial(n));
        sc.close();
       
    }
}
