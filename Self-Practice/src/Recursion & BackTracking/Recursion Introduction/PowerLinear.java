import java.util.*;
public class PowerLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xpn = powerLinear(x,n);
        System.out.print(xpn);
    }

    public static int powerLinear(int x, int n) {
        if(n == 0) {
            return 1;
        }

        int xpnm1 = powerLinear(x, n - 1);
        int xpn = x * xpnm1;
        return xpn;
    }
}
