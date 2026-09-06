class Solution {
    public int search(int[] nums, int target) {
        int low = 0;int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid ;

            //left sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid-1; //eliminate right half
                }else{
                    low = mid+1; // eliminate left half
                }
            }
            //right sorted
            else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1; //eliminate left half
                }else{
                    high = mid - 1; //eliminate right half
                }
            }
        }
        return -1;
    }
}