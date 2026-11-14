class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left =0;
        int right = n-1;
        int index = n-1;
        int[] ans = new int[n];

        while(left <= right){
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];

            if(l<r){
                ans[index] = r;
                right -- ;
            }else{
                ans[index] = l;
                left++;
            }
            index--;
        }
        return ans;
    }
}