/*
 * 12. **Counting Vowels and Consonants in a String**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to count vowels and consonants in a given string.  
    **Example**:  
    Input: `string = "hello world"`  
    Output: `Vowels: 3, Consonants: 7`  
    Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).  

 */
import java.util.*;;
public class question12 {
    public static void vowelsandconsontet(String str){
        int vowels=0;
        int consonants = 0;
        for(int i = 0;i<str.length();i++){
            char valu = str.toLowerCase().charAt(i);
            if(valu=='a'|| valu == 'u'|| valu=='i'|| valu == 'e'|| valu =='o' ){
                vowels++;
            }else if(valu == ' '){
              continue;
            }else if(valu>='a'&& valu<='z'){
                consonants++;
            }
        }
        System.out.println( "vowels in present in string :" +vowels);
        System.out.println("constonet in present in string: "+consonants);
    }
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter String");
    String str = sc.nextLine();
    vowelsandconsontet(str);
    sc.close();
    }
    
}
