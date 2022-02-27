// 1672. Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        //person = row
        //account = column
        int maxVal = 0;
        for(int person = 0; person < accounts.length; person++) {
            // when you start a new row, take a new sum for that row
            int rowSum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }
            
            // now since we have the sum of the row/accounts of one one person
            // so check with overall answer
            if(rowSum > maxVal) {
                maxVal = rowSum;
            }
        }
        return maxVal;
    }
}