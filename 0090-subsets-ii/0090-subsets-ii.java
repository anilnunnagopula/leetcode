class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> l=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<(1<<n);i++){//2^n
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&1<<j)==0){
                    al.add(nums[j]);
                }
            }
            if(!l.contains(al))l.add(al);
            
        }
        return l;
    }
}