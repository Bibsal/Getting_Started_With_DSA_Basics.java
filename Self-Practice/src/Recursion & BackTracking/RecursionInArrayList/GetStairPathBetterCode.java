import java.util.*;
public class GetStairPathBetterCode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(getStairPath(n));
    }

    public static ArrayList<String> getStairPath(int n) {
        if(n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n < 0) return new ArrayList<>();
        ArrayList<String> myAnsArLst = new ArrayList<>();
        for(int jump = 1; jump <= 3; jump++) {
            ArrayList<String> faithpaths = getStairPath(n - jump);
            for(String ans : faithpaths) {
                myAnsArLst.add(jump + ans);
            }
        }
        return myAnsArLst;
    }
    
}