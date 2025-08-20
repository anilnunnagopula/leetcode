class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        // int XOR=0;
        // for(int i=0;i<nums.length;i++){
        //     XOR^=nums[i];
        // }
        // System.out.println(XOR);
        // return XOR==0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int v:map.values()){
            if(v%2!=0)return false;
        }
        return true;
        // return map.size()==n/2;
    }
}