class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int unique = 1;

        while(j<nums.length){
            if(nums[j-1] == nums[j]){
                j++;
                continue;
            }else{
                nums[i+1] = nums[j];
                i++;
                unique++;
                j++;
            }
        }
        return unique;
    }
}