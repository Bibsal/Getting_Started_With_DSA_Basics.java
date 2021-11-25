//Output format :- 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
//Phle n print kro then call n - 1 then phir n print kro then again call n - 1 then again print kro n, and base case n equal to 0 hua tho return kr do, then it'll print according to our expected output !!
//CODE :-
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n == 0) {
            return;
        }

        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
    }

}