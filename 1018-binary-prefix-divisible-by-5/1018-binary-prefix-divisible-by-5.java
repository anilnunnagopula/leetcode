class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l=new ArrayList<>();
        // StringBuilder sb=new StringBuilder();
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            // sb.append(nums[i]);
            // int p=Integer.parseInt(sb.toString(),2);
            prefix=(prefix*2+nums[i])%5;
            if(prefix%5==0){
                l.add(true);
            }
            else{
                l.add(false);
            }
            // System.out.println(p);
        }
        return l;

    }
}