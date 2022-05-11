import java.util.*;
public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        celebrityCheck(arr);
    }

    public static void celebrityCheck(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++) {    // phle sare index ko push karnge, then niche check karte hue accordingly pop karnge and last me hamare pas ak index bachega stack me so wo hamara potential answer considered hoga qki wo abi sari values k sath check nhi hua rhta hai so is potential answer ko bhi hum check karke bta dnge ki kya koi celebrity hai ki nhi
            st.push(i);
        }

        while(st.size() >= 2) {     // yaha while stack ka size greater than 2 hi rhna chaiye tabhi tho hum do indices ko compare kar paynge and last me jaise hi ak bachega so loop apne ap hi break ho jaiye ga and hame hamara potential answer mil jaiyega
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1) {     // this checks ki agar i -> j ko janta hai tho i celebrity nhi ho skta qki celebrity wo hai jisko sab jante hai but wo kisi ko nhi janta, so i yaha j ko janta hai so we will push j back in stack
                st.push(j);
            } else {              // else me i -> j ko nahi janta so j tho celebrity nhi ho skta so we will push i back in the stack
                st.push(i);
            }
        }

        int potAns = st.peek();     // so last me hamare stack me jo bhi bacha hai wo hamara potential answer hoga so ham ussae ab agae bakiyo sae check kar k final bta dnge ki ye potential wala bhi sach me celebrity hai ki nhi, agar nahi hai tho none print kar dnge warna usko as a confirm celebrity hi print kar dnge
        for(int i = 0; i < arr.length; i++) {
            if(i != potAns) {     // we will not check in the same index right qki idx 2, potAns 2 ko hi janna matlab khud ko hi janna hai, so ofcourse we will not check in self
                if(arr[i][potAns] == 0 || arr[potAns][i] == 1) {
                    System.out.println("none");
                    return;
                }
            }
        }

        System.out.println("So our celebrity is :- "+potAns);
    }
}
