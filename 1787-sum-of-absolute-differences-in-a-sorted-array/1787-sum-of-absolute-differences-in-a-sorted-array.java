class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int pref[]=new int [n];
        int suf[]=new int [n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }

        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]+nums[i];
        }

        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
                ans[i]=suf[1]-(n-1)*nums[0];
            }
            else if(i==n-1){
                ans[i]=i*nums[i]-pref[n-2];
            }
            else{
                // ans[i]=suf[i+1]-nums[i]*(n-i-1)+pref[i-1]-nums[i]*i;
                ans[i] = (nums[i] * i - pref[i-1]) + (suf[i+1] - nums[i] * (n - 1 - i));
            }
        }
        return ans;
    }
}