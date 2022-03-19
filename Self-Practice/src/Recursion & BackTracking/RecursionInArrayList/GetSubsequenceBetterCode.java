import java.util.*;
public class GetSubsequenceBetterCode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.print(getSubsequence(str));
    }

    public static ArrayList<String> getSubsequence(String str) {
        if(str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        // First we will work with our faith, i.e call this same function with passing sub string as recursion call. 
        ArrayList<String> faithROS = getSubsequence(str.substring(1));           // directly passing the substring
        ArrayList<String> myAnsArLst = new ArrayList<>(faithROS);                // since hamara ak bar char add nahi hota & ak bar hota hai, so us nahi hota kae liye hum log directly us arraylist ko yaha copy kar rhe hai arraylist me, it made our work easier than previous as we dont have to declare a new loop for loop for adding all the elements of substrings
        for(String ans : faithROS) {
            myAnsArLst.add(str.charAt(0) + ans);
        }
        return myAnsArLst;
    }
}