


/*
 * 20. **Checking for Perfect Numbers**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to determine if a number is a perfect number.  
    **Example**:  
    Input: `number = 28`  
    Output: `Perfect Number`  
    Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
*/
public class question20 {
    public static void PerfectNum(int n){
         int sum = 0;
         for(int i = 1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
         }
         if(n == sum){
            System.out.println("Prefect Number");
         }else{
            System.out.println("Not  a Prefec Number");
         }
    }
    public static void main(String[] args) {
        int  num = 6;
        PerfectNum(num);
    }
    
}
