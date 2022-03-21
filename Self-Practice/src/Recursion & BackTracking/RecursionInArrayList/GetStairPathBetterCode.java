import java.util.*;
public class GetStairPathBetterCode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(getStairPath(n));
    }

    public static ArrayList<String> getStairPath(int n) {
        if(n == 0) {                    // base case 1
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n < 0) return new ArrayList<>();     // base case 2
        ArrayList<String> myAnsArLst = new ArrayList<>();
        for(int jump = 1; jump <= 3; jump++) {
            ArrayList<String> faithpaths = getStairPath(n - jump);
            for(String ans : faithpaths) {
                myAnsArLst.add(jump + ans);
            }
        }
        return myAnsArLst;


        /* We can even avoid our base case 2 and code in the following manner below
            ArrayList<String> myAnsArLst = new ArrayList<>();
            for(int jumps = 1; jumps <= 3; jumps++) {
                if(n - jumps >= 0) {
                    ArrayList<String> faithPaths = getStairPath(n - jumps);
                    for(String ans : faithPaths) {
                        myAnsArLst.add(jumps + ans);
                    }
                }
            }
            return myAnsArLst;
        */
    }
    
}