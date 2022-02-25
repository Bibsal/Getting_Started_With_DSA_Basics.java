import java.util.*;

public class sumViaChecking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextInt();
        String s2 = scn.nextInt();

        char c1 = s1.charAt(0);
        char c2 = s1.charAt(0);
        
        if((c1 < '0' && c1 > '9') || (c2 < '0' && c2 > '9' )){
            System.out.println("Please pass integer value");
            return;
        }

        

    }
}