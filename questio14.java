/*
 * 14. **Finding the Largest and Smallest Numbers in an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find the largest and smallest numbers in an array.  
    **Example**:  
    Input: `array = [4, 7, 1, 8, 5]`  
    Output: `Largest: 8, Smallest: 1`  
    Explanation: The largest number in the array is 8 and the smallest is 1.  

 */



public class questio14 {
    public static void largestandminum(int arr[]){
         int largest = Integer.MIN_VALUE;
         int minmum  = Integer.MAX_VALUE;
         for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(minmum>arr[i]){
                minmum = arr[i];
            }
         }
      System.out.println("largest number  : " + largest);
      System.out.println("minimum number : "+ minmum);

    }
    public static void main(String[] args) {
         int arr[] = {4,7,57,57,5,75,85,75,744,0,15,};
        largestandminum(arr);
    }
}
