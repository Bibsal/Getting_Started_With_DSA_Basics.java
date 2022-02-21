import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt(); 
        toh(n, t1id, t2id, t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n == 0) {
            return;
        }

        toh(n - 1, t1id, t3id, t2id);     // call from -->> 1 to 3 using 2
        System.out.println(n +"[" + t1id + " -> " + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);     // call from or sending back 3 to 2 using 1

    }

}