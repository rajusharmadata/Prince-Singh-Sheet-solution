import java.util.*;
public class question11 {
    public static int Lcm(int a,int b){
        int min = Math.min(a, b);
        while (min>0) {
            if(a%min==0 && b%min==0){
                break;
            }
            else{
                min--;
            }
        }
      int num1=  a/min ;
      int num2=b/min;
      return (min*num1*num2);
    }
    public static void main (String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second  number");
        int b = sc.nextInt();
         System.out.println( "Least Common Multiple : "+Lcm(a, b));
         sc.close();
}

}
