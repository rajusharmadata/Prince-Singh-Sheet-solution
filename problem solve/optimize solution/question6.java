
import java.util.*;
public class question6 {
    // uesing recorsen
    public static boolean StringPlandromchek(int i,int j,String str){
        // cheak the i is greter and equal then of j to retrn true

        
        if(i>=j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        // my base case is return statement
        return (StringPlandromchek(i+1, j-1, str));
    }
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
        int i = 0;
        int j = str.length()-1;
       if( StringPlandromchek(i, j, str)){
        System.err.println("Planidorm");
       }else {
        System.err.println("not planidorm");
       }

    }

}
