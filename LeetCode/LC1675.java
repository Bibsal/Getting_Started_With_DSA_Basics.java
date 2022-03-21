Hi everyone! The forum has several excellent solutions, but as always I like to give my own because I think some of these geniuses here don't understand how we normal people think ;)

Alright so... the problem is asking to minimize the maximum difference between any two elements in the array. I think the first realization we need to arrive at is that this maximum difference will be between the minimum element in the array and the maximum element in the array.

So my first thought was... we can keep operating on the min and max value in the array and calculating their difference - the expensive part of this approach is either recalculating min and max after each step, or keeping the array sorted.

An intuition at this point was to use a BST: we can remove the value to increase or decrease from the tree, increase it or decrease it, and put it back in the tree, in logarithmic time (if the tree is balanced, which, it should be).

So that was my first solution, using a Java TreeSet<Integer> and operating as described. This has the extra benefit of eliminating any duplicates. And this works for many inputs. However, it runs into the following question:

When the min element is even and the max element is odd, we cannot continue processing because we cannot increase even values or decrease odd values (alright)
When both elements are odd, we have to increase the min to get them closer (increasing the max would only make the gap bigger, and we cannot decrease it) (alright)
When both elements are even, we have to decrease the max to get them closer (as explained above) (alright)
When the min element is odd and the max element is even though... there is a choice to make. We can make the min bigger or the max smaller. Which one do you choose? (Not alright!)
So my initial approach was to always choose to make the min bigger in this case. But the truth is, none of this approaches works for every possible input.

And also... it falls into LOOPS.

Consider this example: [3,4,5] (assume we put the elements into a TreeSet)

We get the min (3) and the max (5)
We make the min bigger (6) and put it back in the tree

This results in [4,5,6]

When we apply the algorithm again, we realize that both min and max are even, which per rules above we advance by halving the max, so we go back to [3,4,5]!!

I spent some time here, because these loops are hard to detect... there can be some easy solutions for 1-step loops like this one, but some loops are longer and would demand us to code DFS with loop detection, essentially. I'm pretty sure that would TLE.

Thinking deeper, the problem behind these loops is that we don't remember that in [3,4,5] the 3 that converts to a 6 and back to a 3 is always originated by the same element... if we had that memory, we could stop processing when we find a number that we have already moved in that direction. So that's an option, I guess.

Another way that I thought to try to eliminate loops is to divide all even numbers by 2 as much as we can (to some sort of "canonical" form), and start processing from there just making numbers bigger and never smaller. This is an interesting idea, but it fails for the following reason: if a number has 2 as a factor more than once (for example 96 is 2^5 * 3, so 2 is 5 times there) we will arrive at some odd number (3 in the example) and the number won't be able to grow anymore. This can be a problem. Consider:

[96, 41]

If we preprocess this array the way we described, we arrive at [3, 41]. We would like now to make 3 bigger, so we go to [6, 41] and now we have to stop because 6 is even. So this idea is dumb, but it made me think about trying the opposite: making the odd numbers as big as we can and only proceed by making numbers smaller. This works because we can only make each number bigger once. Why? Because we make numbers bigger by multiplying them by 2, which makes them even, which forces us to stop.

Alrighty then, we have a solution!

Put all elements of the array into a TreeSet. If the element is odd, add its double instead.
While not finished (more on this later), read the max and the min from the tree and see if their diff bests our best result so far
Remove the max, divide it by 2 and insert it back into the tree
So when are we done? When we get to a diff of 0 (we can't optimize further), or when the max in the tree is odd (we can't make it smaller).

Cool then! Here is the code:

class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int num : nums) {
            if (isEven(num)) tree.add(num);
            else tree.add(num*2);
        }
        
        int min = tree.first();
        int max = tree.last();
        int result = max-min;
        
        while (!finished(min, max, result)) {
            tree.remove(max);
            tree.add(max/2);
            min = tree.first();
            max = tree.last();
            result = Math.min(result, max-min);
        }
        
        return result;
    }
    
    private boolean finished(int min, int max, int result) {
        return result == 0 || isOdd(max);
    }
    
    private boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    private boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
The runtime complexity of this approach is

O(nlogn) for adding all elements to the BST
O(nlogn) for removing all the elements from the tree once, decreasing them, and putting them back (worst case)
so O(nlogn) overall (actually I was wrong with this, if the max value is a power of 2, you will have to keep dividing it many times. Anyway, the actual complexity will end up being O(nlognlogm) with m being the highest power of 2 present in the array - the point stands though that this is a linearithmic algorithm).

If you submit this solution, it will pass all testcases and perform well. It can be optimized a bit more. If interested, keep reading.

Since we always operate on the max, we know what the min is, it's either the previous min or the max/2 that we are inserting into the tree. So instead of fetching the min, we can just memorize it. This has the same runtime complexity as the previous approach, but a better constant factor (one less BST operation per loop execution).

class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int num : nums) {
            if (isEven(num)) tree.add(num);
            else tree.add(num*2);
        }
        
        int min = tree.first();
        int max = tree.last();
        int result = max-min;
        
        while (!finished(min, max, result)) {
            tree.remove(max);
            tree.add(max/2);
            min = Math.min(min, max/2);
            max = tree.last();
            result = Math.min(result, max-min);
        }
        
        return result;
    }
    
    private boolean finished(int min, int max, int result) {
        return result == 0 || isOdd(max);
    }
    
    private boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    private boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
But then this leads to another possibility: if we care about max only, we can use a max-heap instead of a BST! Same code, but changing the data structure. Which yields the following solution:

class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if (isEven(num)) heap.add(num);
            else {
                num*=2;
                heap.add(num);
            }
            min = Math.min(min, num);
        }
        
        int max = heap.poll();
        int result = max-min;
        
        while (!finished(min, max, result)) {
            heap.add(max/2);
            min = Math.min(min, max/2);
            max = heap.poll();
            result = Math.min(result, max-min);
        }
        
        return result;
    }
    
    private boolean finished(int min, int max, int result) {
        return result == 0 || isOdd(max);
    }
    
    private boolean isEven(int num) {
        return num % 2 == 0;
    }