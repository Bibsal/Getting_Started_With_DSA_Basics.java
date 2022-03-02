//  1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 1; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        
        
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        // now we directly check that if candies[ka element] + extraCandies >= max then result[i] me true dal do warna false, and last me yahi result array ko return kar do.
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}