import java.util.*;

public class Decimal_To_AnyBase{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = DecimalToAnyBase(n, b);
    System.out.println(dn);
  }
  // Function for converting number from decimal to base-b number system
  public static int DecimalToAnyBase(int n, int b) {
    int p = 1;     //Power variable - it increases places
    int rv = 0;     //Return value - it stores answer
    while (n > 0)
    {
      int dig = n % b;    //Digit- it stores remainder at each step
      n = n / b;    // dividing the number by base number to reduce the number
      rv = rv + (dig * p);    //placing digit at right place
      p *= 10;     // increasing power; to the next place
    }
    return rv;     //Returning Final converted number to the above called function and storing it in dn(destination number) and printing it !!!
  }
}