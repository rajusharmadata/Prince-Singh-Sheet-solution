/*
 *  **Generating Multiplication Tables**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to generate multiplication tables for a given number.  
    **Example**:  
    Input: `number = 4`  
    Output:  
    ```
    4 x 1 = 4  
    4 x 2 = 8  
    4 x 3 = 12  
    4 x 4 = 16  
    4 x 5 = 20  
    ```  
    Explanation: The multiplication table for 4 up to 5 is generated. 
 */
public class question18 {
     public static void PrintTable(int n ){
        for(int i = 1;i<=5;i++){
            System.out.println(n+ " x " + i + " = " + n*i);
        }
     }
    public static void main(String[] args) {
        int table = 4;
        PrintTable(table);
    }
}