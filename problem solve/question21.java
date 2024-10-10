/**
 * 23. **Finding the Fibonacci Number at a Specific Position**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Sequences  
    **Description**: Write a program to find the Fibonacci number at a specific position.  
    **Example**:  
    Input: `position = 5`  
    Output: `5`  
    Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).  

 */
public class question21{
   public static int  fibo(int position){
      if(position == 0){
         // throw new IllegalArgumentException("Invalid position");
        System.out.println("wong postiion");
        return -1;
      }else if(position == 1){
         return 0;
      }else{
         int a = 0;
         int b = 1;
         for(int i = 2;i<=position;i++){
            int nextelement = a+b;
             a = b;
             b = nextelement; 
         }
         return  b;
      }
      
   }
    

   public static void main(String[] args) {
      System.out.println(fibo(0));
      
   }
}