/*
 * **Validating Leap Years**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Date Handling  
   **Description**: Write a program to check if a given year is a leap year.  
   **Example**:  
   Input: `year = 2020`  
   Output: `Leap Year`  
   Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.  
    1700, 1800, 1900, 2100, 2200, 2300, 2500, and 2600
     :) Leap year check karne ke leye hamko check karna padega  ki mera year kay 4 se divide hota hai ki nahi 
     uske baad agar o 100 se divide hoga aur 400 se divide hot hai to o leap year hai nhi to not leap year
      hai 

 */

// condition second 
/*
 century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
A leap year (except a century year) can be identified if it is exactly divisible by 4.
A century year should be divisible by 4 and 100 both.
A non-century year should be divisible only by 4.

  if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 != 0))) {
 
 */

import java.util.*;

public class question3 {
    public static void leapYear(int year) {
        boolean isleap_year;

        if (year % 4 == 0) {
            isleap_year = true;
            if (year % 100 == 0){

            
            // check year is divesul by 400
           if(year % 400 == 0) {
                isleap_year = true;
            }
             else 
             {
                isleap_year = false;
            }
        }
        } else {
            isleap_year = false;
        }

        if (isleap_year == true){
            System.out.println("Given year is leap year  :"+year);
        }else{
            System.out.println("Given year is not leap year :" + year);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = sc.nextInt();
        leapYear(year);

    }

}
