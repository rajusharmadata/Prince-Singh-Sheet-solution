/*
 * 
19. **Finding Prime Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find all prime numbers within a given range.  
    **Example**:  
    Input: `range = [10, 30]`  
    Output: `[11, 13, 17, 19, 23, 29]`  
    Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.  
 */
public class question19 {

    public static boolean chekPrime(int n){
        boolean isPrime = true;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void PrintPrimeNumber(int r1,int r2){
        System.out.print("All prime number "+ " ");
        for(int i = r1;i<r2;i++){
           if( chekPrime(i)){
            System.out.print(i+ " ");
           }
        }
        }
    
    public static void main(String[] args) {
        int Range1 = 10;
        int Range2 = 30;
        PrintPrimeNumber(Range1, Range2);
    }
}
