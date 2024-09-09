/*
 *  **Checking for Prime Numbers**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Number Theory  
   **Description**: Write a program to determine if a number is prime.  
   **Example**:  
   Input: `number = 7`  
   Output: `Prime`  
   Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.  
 */
import java.util.*;
public class question2 {
    public static boolean Prime(int num){
        
        int i = 2;
        if(num == i || num == 1){
            return true;
        }
        while(i<num-1 ){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        boolean ans = Prime(num);
        if(ans == true){
            System.out.println(" Given number is Prime :" + num);
        }else{
            System.out.println(" Given number is not Prime :" + num);
        }
    }
}