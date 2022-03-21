// 1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        // Try following the same logic you used to solve the inverse question.
        int[] inv = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int val = nums[nums[i]];        // you can only write // int[i] = nums[nums[i]]; // and skip the below line
            inv[i] = val;
        }
        return inv;
    }
}