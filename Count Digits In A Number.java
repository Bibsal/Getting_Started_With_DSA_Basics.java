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
        System.out.print(nod);
    }
}