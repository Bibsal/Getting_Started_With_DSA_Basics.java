import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int nod=0;
        int temp=n;
        while(temp!=0)
        {
            temp=temp/10;
            nod++;
        }
        
        k=k%nod;
        
        if(k<0)
        {
            k=k+nod;
        }
        
        int divisor=1;
        int multiplier=1;
        for(int i=1;i<=nod;i++)
        {
            if(i<=k)
            {
                divisor=divisor*10;
            }
            else
            {
                multiplier=multiplier*10;
            }
        }
        
        int quotient = n / divisor;
        int remainder = n % divisor;
        
        int rotated = remainder * multiplier + quotient;
        
        System.out.print(rotated);
        
    }
}