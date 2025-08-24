class Solution {
    public int longestSubarray(int[] nums) {
        
        // int allowed=1;
        // int max=0;
        // int cnt=0;
        int prev = 0; 
        int cnt = 0;    // current streak of 1s
        int max = 0;
        boolean hasZero = false;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]==1&&allowed>=0){
            //     cnt++;
                
            // }
            // else if(nums[i]==0&&allowed>=0){
            //     allowed--;
            // }
            // else{
            //     cnt=0;
            //     allowed=1;
            // }
            // max=Math.max(max,cnt);
            if (nums[i] == 1) {
                cnt++;
            } else { 
                hasZero = true;
                max = Math.max(max, prev + cnt); 
                prev = cnt;  // save left streak
                cnt = 0;     // reset for right streak
            }
            max = Math.max(max, prev + cnt);
        }
        // return max;
        return hasZero ? max : nums.length - 1;
    }
}