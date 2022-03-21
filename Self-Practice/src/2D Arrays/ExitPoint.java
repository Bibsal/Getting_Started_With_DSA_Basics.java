// TU HI NIRANKAR , MAI TERI SARANHA , MAI NU BAKSH LO 
import java.util.*;
public class ExitPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();      // rows
        int m = scn.nextInt();      // columns
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();           // taking element inputs
            }
        }
        scn.close();
        // so in this question also we will solve using the same method i.e directions by working with i and j.
        // i.e when our i is 0 we will move east, if i = 1 then north , if i = 2 then east, if i = 3 then north and for i = 4 we will take mod which will give remainder as 0 again and it moves to east
        // and from which ever place the exit is done we need to print that index

        // so we declare an i, j and a dir(direction) variable through which we will complete our code

        int i = 0; 
        int j = 0;
        int dir = 0;
        // east, south, west, north
        
        while(true) {
            dir = (arr[i][j]) % 4 ;
            if(dir == 0) {   // east
                j++;
            } else if(dir == 1) {   // south
                i++;
            } else if(dir == 2) {   // west
                j--;
            } else if(dir == 3) {   // north
                i--;
            }

            // Now check for every value ki agar i negative ho gya i.e fully north chala gya hai tho ak add karnge so that correct ith and jth exit point pata chal jai
            // Now check for every value ki agar j negative ho gya i.e fully west chala gya hai tho ak add karnge so that correct ith and jth exit point pata chal jai
            // Now check for every value ki agar i jyada(extra value) ho gya i.e fully south chala gya hai tho ak add karnge so that correct ith and jth exit point pata chal jai
            // Now check for every value ki agar j jyada(extra value) ho gya i.e fully east chala gya hai tho ak add karnge so that correct ith and jth exit point pata chal jai
             
            if(i < 0) {
                i++;
                break;
            } else if(j < 0) {
                j++;
                break;
            } else if(i == arr.length) {
                i--;
                break;
            } else if(j == arr[0].length) {
                j--;
                break;
            }
        }

        System.out.print("Exit point of matrix is -> " + i + " , " + j);
    }
}