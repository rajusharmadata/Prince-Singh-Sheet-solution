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
    public static void ArmstrongNUm() {

        for (int i = 1; i <= 500; i++) {
            int first = i;
            int ans = 0;
            int second = i;
            int squ = 0;
            // find the digit how many digit in my number
            while (first > 0) {

                squ++;
                first = first / 10;
            }
            // total number of digit  and squear find
            while (second > 0) {
                int rem = second % 10;
                ans += (int) Math.pow(rem, squ);
                second /= 10;
            }
            if (i == ans) {
                System.out.println(ans);
            }
        }
    }

    public static void main(String[] args) {

        ArmstrongNUm();

    }
}
