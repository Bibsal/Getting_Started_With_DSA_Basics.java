import java.util.*;
public class EulerTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        eulerFN(n);
    }

    public static void eulerFN(int n) {
        if(n <= 0) {
            System.out.print(" Base:" + n);
            return;
        }

        System.out.print(" Pre:" + n);
        eulerFN(n-1);
        System.out.print(" In:" + n);
        eulerFN(n-2);
        System.out.print(" Post:" + n);
    }
}

/*  OUTPUT :-
Pre:6 Pre:5 Pre:4 Pre:3 Pre:2 Pre:1 Base:0 In:1 Base:-1 Post:1 In:2 Base:0 Post:2 In:3 Pre:1 Base:0 In:1 Base:-1 
Post:1 Post:3 In:4 Pre:2 Pre:1 Base:0 In:1 Base:-1 Post:1 In:2 Base:0 Post:2 Post:4 In:5 Pre:3 Pre:2 Pre:1 
Base:0 In:1 Base:-1 Post:1 In:2 Base:0 Post:2 In:3 Pre:1 Base:0 In:1 Base:-1 Post:1 Post:3 Post:5 In:6 Pre:4 
Pre:3 Pre:2 Pre:1 Base:0 In:1 Base:-1 Post:1 In:2 Base:0 Post:2 In:3 Pre:1 Base:0 In:1 Base:-1 Post:1 Post:3 
In:4 Pre:2 Pre:1 Base:0 In:1 Base:-1 Post:1 In:2 Base:0 Post:2 Post:4 Post:6
*/