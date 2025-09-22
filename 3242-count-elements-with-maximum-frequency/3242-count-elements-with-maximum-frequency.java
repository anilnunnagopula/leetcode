class Solution {
    public int maxFrequencyElements(int[] nums) {

        int a[]=new int[101];
        int max=0;
        for(int i=0;i<nums.length;i++){
            a[nums[i]]++;
            max=Math.max(max,a[nums[i]]);
        }

        int cnt=0;

        for(int i=0;i<101;i++){
            if(a[i]==max){
                cnt++;
            }
        }
        return cnt*max;
        
    }
}