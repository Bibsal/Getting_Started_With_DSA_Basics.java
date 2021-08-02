import java.util.*;
  
  public class AnyBase_To_Decimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = AnyBasetoDecimal(n, b);
      System.out.println(d);
   }
  
   public static int AnyBasetoDecimal(int n, int b){
       int rv=0;
       int p=1;
       
       while(n!=0){
           int rem=n%10;
           n=n/10;
           
           rv=rv+rem*p;
           p=p*b;
       }
       return rv;
   }
  }