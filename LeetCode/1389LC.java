// 1389. Create Target Array in the Given Order
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target =new int[nums.length];
        for(int i = 0; i < target.length; i++) {
            if(index[i] < i) {                    // checking whether we have to shift or not.
                for(int j = i; j > index[i]; j--) {  //this loop will work for shifting of elements to right side
                    target[j] = target[j - 1];      // shifting, for adding new elements in the occupied position
                }
            }
            target[index[i]] = nums[i];          // inserting element
        }
        return target;
    }
}