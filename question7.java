/*
 *  **Crafting Star Patterns**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Patterns  
   **Description**: Write a program to create different star patterns (e.g., pyramid, diamond).  
   **Example**:  
   Input: `patternType = "pyramid", height = 5`  
   Output:  
   ```
       *
      ***
     *****
    *******
   *********
   ```  
   Explanation: A pyramid pattern with a height of 5 is generated.
 */
import java.util.*;
public class question7 {
    public static void printPiramid(int n) {
        int r = 1;
        for (int i = 0; i < n; i++) {
            // space print
            for (int j = 0; j < n - i - 1; j++) {
                System.err.print(" ");
            }
            // star
            for (int k = 0; k < r; k++) {
                System.out.print("*");
            }
            // updation
            r = r + 2;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printPiramid(n);
    }

}