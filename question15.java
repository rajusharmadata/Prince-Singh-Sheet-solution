/*
 * . **Sorting an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Sorting Algorithms  
    **Description**: Write a program to sort an array of numbers in ascending order.  
    **Example**:  
    Input: `array = [3, 1, 4, 1, 5, 9]`  
    Output: `[1, 1, 3, 4, 5, 9]`  
    Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].  

 */
public class question15 {
    public static void sortinginArr(int arr[]){
        // using bubble sort
       
        for(int i = 0;i<arr.length;i++ ){
            for(int j = 0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

       
    }
    public static void printArr(int arr[]){
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={3, 1, 4, 1, 5, 9};
        printArr(arr);
        sortinginArr(arr);
        printArr(arr);
    }
}
