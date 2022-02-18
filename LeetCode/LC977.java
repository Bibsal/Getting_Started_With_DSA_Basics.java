// Using the two pointer approach.
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        int left = 0;
        int right = n - 1;
        
        int k = n - 1;
        int[] numsSq = new int[n];
        
        while(left <= right) {
            int leftSq = nums[left] * nums[left] ;
            int rightSq = nums[right] * nums[right];
            
            if(leftSq > rightSq) {
                numsSq[k] = leftSq;
                left++;
            } else {
                numsSq[k] = rightSq;
                right--;
            }
            k--;
        }
        
        return numsSq;
    }
}
