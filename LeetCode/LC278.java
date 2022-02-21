// Question 278
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int li = 1;
        int ri = n;
        int ans = 0;
        while(li <= ri) {
            int mid = li+(ri - li) / 2;
            if(isBadVersion(mid) == true) {
                ri = mid - 1;
                ans = mid;
            } else {
                li = mid + 1;
            }
        }
        return ans;
    }
}