/*
 * 9. **Summing Digits of a Number**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to calculate the sum of digits of a number.  
   **Example**:  
   Input: `number = 1234`  
   Output: `10`  
   Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.  

 */
import java.util.*;
public class question9 {
    public static int calculatesum(int n){
     int sum = 0;
      while (n>0) {
      int rem = n%10;
      sum+=rem;
      n = n/10;
      }
      return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        System.out.println(calculatesum(num));
    }
}
