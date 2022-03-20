import java.util.*;
public class GetKPC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        ArrayList<String> totalCombinations = getKPC(str);
        System.out.print(totalCombinations);
    }
    // we have to declare a global string array so that it's scope remains for everymethod
    static String[] array = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> faithROS = getKPC(str.substring(1));               // faithRestOfString
        ArrayList<String> myAnsArLst = new ArrayList<>();
        String word = array[str.charAt(0) - '0'];              // str.charAt(0) will bring the 1st character of the button we've pressed(Eg: for 179 k liye it'll bring 1 but in a character form so if we subtarct '1' - '0'(both character) ans will be = 1 (in interger), so this 1 will be our main useful thing as it'll work now i.e array[1] that will give us the element at index 1 from the global string array i.e abc) 
        for(int i = 0; i < word.length(); i++) {
            for(String s : faithROS) {
                myAnsArLst.add(word.charAt(i) + s);          // and here from 21st line k character kae ak ak element ko add karnge faithROS kae sath
            }
        }
        return myAnsArLst;
    }
}
