import java.util.*;
public class DigitFrequency{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();      //Taking a number 
        int d=scn.nextInt();      //Taking single digit for which we want to find the frequency of this digit from the number n.
        int tnod=frequencyChecking(n,d);       //Calling the function and storing the returned value in tnod and printing it..
        System.out.println(tnod);
        
    }
    public static int frequencyChecking(int n, int d){

            int count = 0;      //Declaring a count variable so that we can increase the count whenever any remainder(rem) matches the digit (d)..and lastly we can return the count and we'll get our output..
            while(n!=0){
                int rem=n%10;
                n=n/10;
                
                if(rem==d){
                    count++;
                }
            }
            return count;
            
        
    }
}