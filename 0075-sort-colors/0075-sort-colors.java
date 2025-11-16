class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int low=0;
        int high=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(mid>high)break;
            if(nums[mid]==0){
                //swap;
                int t=nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                //swap;
                int t=nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
            }
        }
    }
}