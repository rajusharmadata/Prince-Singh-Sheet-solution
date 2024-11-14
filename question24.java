/*
 24. **Printing Prime Numbers Less Than a Given Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to print all prime numbers less than a given number.  
    **Example**:  
    Input: `number = 20`  
    Output: `2, 3, 5, 7, 11, 13, 17, 19`  
    Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.  

 */
public class question24 {

    public static void PrintprimeNum(int n){
        for(int i = 2; i<n;i++){
            if(i%(i+1)!=0){
                System.out.println();
            }
        }
    }
}