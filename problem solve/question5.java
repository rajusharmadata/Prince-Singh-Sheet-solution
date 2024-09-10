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
public static void Fibonacciseries(int range){
  // pre defiend the first and second term because i know first and second term 0,1
int a = 0;
int b = 1;
int c = a+b;
while (a<range) {// check the iteam my range below 
    System.out.print(a + " ");
    a = b;
    b = c;
    c = a+b;// increase the value of c 

   
}
}
public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number ");
    int num = sc.nextInt();
    Fibonacciseries(num);

}
    
}
