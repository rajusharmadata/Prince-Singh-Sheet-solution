/*
 * 16. **Finding the Sum of Elements in an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find the sum of elements in an array.  
    **Example**:  
    Input: `array = [1, 2, 3, 4, 5]`  
    Output: `15`  
    Explanation: The sum of the elements in the array is 15.  

 */
public class question16 {
    public static int arrsum(int arr[]){
     int sum = 0;
     for(int i = 0; i<arr.length;i++){
        sum+= arr[i];
     }
     return sum;
    }
    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arrsum(arr));
    }
}
