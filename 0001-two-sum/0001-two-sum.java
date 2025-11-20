class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int e=target-nums[i];
            if(map.containsKey(e)){
                a[1]=map.get(e);
                a[0]=i;
                return a;
            }
            map.put(nums[i],i);
        }
        return a;

        // Arrays.sort(nums);
        // int j=nums.length-1;
        // int i=0;
        // while(i<j){
        //     if(nums[i]+nums[j]==target){
                // return new int[]{i,j}; //return true

        //     }
        //     if(nums[i]+nums[j]<target){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // return new int[]{-1,-1};//return false
            


    }
}