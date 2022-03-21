// 1470. Shuffle the Array
// hamara approach yahi hai ki hum do pointer le lnge and unhi do pointer k sath trsverse karke apna answer nikal lnge.
// like we will declare a new array and set two pointers in our nums array and agar hamara idx % 2 karne sae 0 remainder aaiega tho hum nums[idx] ki value ko ans[i] me dal dnge.. just dry run this code you'll understand everything..
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int idx = 0;
        int j = n;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                ans[i] = nums[idx];
                idx++;
            } else {
                ans[i] = nums[j];
                j++;
            }
        }
        return ans;
    }
}
            // ans[i] = nums[i];
            // ans[i + 1] = nums[i + n];