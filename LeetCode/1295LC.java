// 1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;    // taking it so that if our nod is even we increase this to know that wo wala number even tha.
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];   // taking each element of the array so that we can work on single single element
            int nod = 0;       // no of digit
            
            while(n != 0) {
                n = n / 10;
                nod++;
            }
            if(nod % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}