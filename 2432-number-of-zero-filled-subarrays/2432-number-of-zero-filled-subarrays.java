class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long zeroes=0;
        long cnt=0;
        long total=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt++;
            }
            else{
                total+=(cnt*(cnt+1)/2);
                cnt=0;
            }
        }
        if(nums[nums.length-1]==0)total+=(cnt*(cnt+1)/2);
        return total;
    }
}