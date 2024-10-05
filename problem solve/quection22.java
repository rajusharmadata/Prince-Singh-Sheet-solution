
/**
 * 22. **Calculating the Sum of Odd Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of all odd numbers within a given range.  
    **Example**:  
    Input: `range = [1, 10]`  
    Output: `25`  
    Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.  
 */
public class quection22 {
    public static void oddSum(int r1,int r2){
        int caluculateSum = 0;
        for(int i = r1;i<r2;i++){
            if(i%2!=0){
                caluculateSum+=i;
            }
        }
        System.out.println(caluculateSum);
    }
    public static void main(String[] args) {
        int r1 = 1;
        int r2 = 10;
        oddSum(r1, r2);
    }
}
