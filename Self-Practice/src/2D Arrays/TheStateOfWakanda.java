// Wave Traversal
// you just have to print elements as you are walking as a wave in 2d matrix
/* 
Example:-
Input:-
1 2 3
4 5 6
7 8 9
Output:-
1 4 7 8 5 2 3 6 9
*/
import java.util.*;
public class TheStateOfWakanda {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // So main logic to notice here is that when j % 2 == 0 i.e j ko divide karne sae agar remainder even(or 0) ata hai tho hum niche ki taraf walk karnge and opposite when remainder is odd(or 1)
        // so logic is crystal clear i.e we will first start with column's loop i.e j sae start karnge
        // then inside it we will use if condition and check if j % 2 == 0 then we will execute loop from i = 0 to arr.length - 1 and print arr[i][j] inside it
        // and in the else condition (i.e j % 2 != 0) then we will run loop from arr.length - 1 to 0 and print arr[i][j]

        for(int j = 0; j < m; j++) {
            if(j % 2 == 0) {
                for(int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for(int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}