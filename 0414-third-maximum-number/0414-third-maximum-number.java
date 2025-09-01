class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>(Collections.reverseOrder());

        int n=nums.length;

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int thirdMax=0;
        int cnt=0;
        for(int ele:set){
            thirdMax=ele;
            if(set.size()<3)return thirdMax;
            cnt++;
            if(cnt>=3)return thirdMax;
        }
        return thirdMax;
    }
}