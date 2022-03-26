import java.util.*;
public class GetMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        System.out.println(getMazePath(1,1,n,m));
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> totalPaths = new ArrayList<>();
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc < dc) {
            hpaths = getMazePath(sr, sc + 1, dr, dc);
        }

        if(sr < dr) {
            vpaths = getMazePath(sr + 1, sc, dr, dc);
        }

        for(String faithhori : hpaths) {
            totalPaths.add("h" + faithhori);
        }
        for(String faithver : vpaths) {
            totalPaths.add("v" + faithver);
        }
        return totalPaths;
    }
}
