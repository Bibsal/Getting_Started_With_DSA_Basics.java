import java.util.*; 
public class Main
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int nod=0;
        while(temp!=0)
        {
            temp=temp/10;
            nod++;
        }
        int div=(int)Math.pow(10,nod-1);
        while(div!=0)
        {
            int digit=n/div;
            System.out.println(digit);
            n=n%div;
            div=div/10;
        }
    }
}