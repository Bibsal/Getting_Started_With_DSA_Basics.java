// 34. Find First and Last Position of Element in Sorted Array
// our brute force thinking would be that we would have traversed and searched linearly and then get our first and last index, but this takes linear time complexity (i.e O(n)) so we can optimise it by using binary search.
// so our optimised approach will be that we'll use binary search by taking out the mid (by using (li + ri) / 2; and then search the element and when our target == nums[mid] then we store that value in our first and last index and again reinitialise ri = mid - 1 for finding first index so that we can go more ahead and check whether our element is present out there or not, and for getting last index we reinitialise li = mid + 1 and move our pointer more ahead and check whether our element is present ahead or not.
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int li = 0; 
        int ri = nums.length - 1;
        int fsid = -1;
        int lsid = -1;
        while(li <= ri) {
            int mid = (li + ri) / 2;
            if(target > nums[mid]) {
                li = mid + 1;
            } else if(target < nums[mid]) {
                ri = mid - 1;
            } else {
                fsid = mid;
                ri = mid - 1;
            }
        }
        
        li = 0;
        ri = nums.length - 1;
        while(li <= ri) {
            int mid = (li + ri) / 2;
            if(target > nums[mid]) {
                li = mid + 1;
            } else if(target < nums[mid]) {
                ri = mid - 1;
            } else {
                lsid = mid;
                li = mid + 1;
            }
        }
        int[] finalarr = new int[2];
        finalarr[0] = fsid;
        finalarr[1] = lsid;
        return finalarr;
    }
}