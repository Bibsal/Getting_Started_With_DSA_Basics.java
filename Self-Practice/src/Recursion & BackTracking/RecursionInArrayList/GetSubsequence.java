import java.util.*;
public class GetSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        ArrayList<String> myAns = getSubSequence(str);
        System.out.println(myAns);
    }

    public static ArrayList<String> getSubSequence(String str) {
        if(str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();      // base result
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> faithROS = getSubSequence(subString);        // faith for rest of the substring
        ArrayList<String> myansArLst = new ArrayList<>();              // my answer array list to store our answer
        for(String ans : faithROS) {
            myansArLst.add(ans);
        }
        for(String ans : faithROS) {
            myansArLst.add(ch + ans);
        }

        return myansArLst;
    }
}
//  In another file we've written this code in much better way