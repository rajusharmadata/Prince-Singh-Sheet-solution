/*
 *  **Generating the Fibonacci Series**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Sequences  
   **Description**: Write a program to generate the Fibonacci series up to a given number.  
   **Example**:  
   Input: `limit = 10`  
   Output: `[0, 1, 1, 2, 3, 5, 8]`  
   Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8]. 
 */
import java.util.*;

public class question5 {
// fibonaccu series
public static void Fibonacciseries(int n){
int a=0;
int b = 1;
int c = 0;
for(int i = 0; i<n;i++){
    System.out.print(a + " ");
    a = b;
    b = c;
    c = a+b;
}
}
public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number ");
    int num = sc.nextInt();
    Fibonacciseries(num);

}
    
}
