/*
 * 
17. **Checking for Armstrong Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find all Armstrong numbers within a given range.  
    **Example**:  
    Input: `range = [1, 500]`  
    Output: `[1, 153, 370, 371, 407]`  
    Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.  

 */

public class question17 {
    public static boolean Armstrongnumber(int num){
        int oringinal_nuber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;
        while (num>0) {
            int digit = num%10;
            sum+= (int) Math.pow(digit, numDigits);
            num/=10;
        }
        return oringinal_nuber == sum;
    }
    
    public static void main(String[] args) {
        System.out.print("[");
        for(int i = 1;i<=500;i++){
            if(Armstrongnumber(i)){
                System.out.print(i + " ");
            }
        }
        System.out.print("]");
       
    }
}
