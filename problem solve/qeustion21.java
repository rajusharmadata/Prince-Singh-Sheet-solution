
/*
 * 21. **Calculating the Sum of Even Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of all even numbers within a given range.  
    **Example**:  
    Input: `range = [1, 10]`  
    Output: `30`  
    Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.  

 */
public class qeustion21 {
    public static void EvenSum(int r1,int r2){
        int caluculateSum = 0;
        for(int i = r1;i<r2;i++){
            if(i%2==0){
                caluculateSum+=i;
            }
        }
        System.out.println(caluculateSum);
    }
    public static void main(String[] args) {
        int r1 = 1;
        int r2 = 50;
        EvenSum(r1, r2);
    }
}
