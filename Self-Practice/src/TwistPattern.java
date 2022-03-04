/*
A    1    
B    2    C    3    
D    4    E    5    F    6    
G    7    H    8    I    9    J    10    
K    11    L    12    M    13    N    14    O    15
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        char ch = 'A';
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(ch+"\t"+val+"\t");
                val++;
                ch++;
            }
            System.out.println();
        }
    }
}