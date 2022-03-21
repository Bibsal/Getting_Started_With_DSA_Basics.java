import java.util.*;
public class GetStairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> totalCombination = getStairPath(n);
        System.out.print(totalCombination);
    }

    public static ArrayList<String> getStairPath(int n) {
        if(n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n < 0) {
            ArrayList<String> negativePath = new ArrayList<>();
            return negativePath;
        }
        ArrayList<String> faithpath1 = getStairPath(n - 1);
        ArrayList<String> faithpath2 = getStairPath(n - 2);
        ArrayList<String> faithpath3 = getStairPath(n - 3);
        
        ArrayList<String> totalPath = new ArrayList<>();

        for(String path1 : faithpath1) {
            totalPath.add(path1 + 1);
        }

        for(String path2 : faithpath2) {
            totalPath.add(path2 + 2);
        }

        for(String path3 : faithpath3) {
            totalPath.add(path3 + 3);
        }

        return totalPath;
    }
}