/*
 * **Calculating Armstrong Numbers**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Number Theory  
   **Description**: Write a program to check if a number is an Armstrong number.  
   **Example**:  
   Input: `number = 153`  
   Output: `Armstrong Number`  
   Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 * 
 */
import java.util.*;
public class question4 {
    public static void Find_Arstrem_number(int num){


        // Brut force Aproch 

        int i =0;
        int valu = num;
        int valu2 =num;
        int is_Arstrom = 0;
        while(num>0){
            i++;
            num/=10;
        }
        
        while(valu2>0){
            int rem_num = valu2%10;
            is_Arstrom = is_Arstrom + (int) Math.pow(rem_num,i);
            valu2/=10;
             
        }
        if(valu == is_Arstrom){
            System.out.println("Given number is Armston number :" + valu + " = " + is_Arstrom);
        }else{
            System.out.println("Given number is Not Armston number" + valu + " != " +is_Arstrom);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        Find_Arstrem_number(number);

    }
}
