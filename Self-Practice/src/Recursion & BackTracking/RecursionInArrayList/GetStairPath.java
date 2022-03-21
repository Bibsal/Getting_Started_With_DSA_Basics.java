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
        ArrayList<String> faithpath1 = getStairPath(n - 1);            // faithpath1 for 1 step
        ArrayList<String> faithpath2 = getStairPath(n - 2);            // faithpath2 for 2 step
        ArrayList<String> faithpath3 = getStairPath(n - 3);            // faithpath3 for 3 step
        
        ArrayList<String> totalPath = new ArrayList<>();               // my answer array list where i'll add all possible paths, above apart from faith this line defines mywork to work for n

        for(String path1 : faithpath1) {
            totalPath.add(path1 + 1);
        }
        /* Normal for loop sae karna hota tho :-
        for(int i = 0; i < faithpath1.size(); i++) {
            totalPath.add("1"+faithpath1.get(i));     // arraylist me get use karke kam pura karte hai
        }
        */
        for(String path2 : faithpath2) {
            totalPath.add(path2 + 2);
        }

        for(String path3 : faithpath3) {
            totalPath.add(path3 + 3);
        }

        return totalPath;
    }
}