class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
         if (n <= 2) {
            return n;
        }
        
        // Find the number of bits needed to represent n
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        
        // Return the next higher power of 2
        return 1 << bits;
    }
}