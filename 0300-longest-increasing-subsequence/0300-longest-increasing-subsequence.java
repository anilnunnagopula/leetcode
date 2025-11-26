class Solution {
    public int findCeilPos(ArrayList<Integer> al,int x){
        int l=0;
        int h=al.size()-1;
        int ans=0;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(al.get(mid)==x)return mid;
            if(al.get(mid)>x){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(al.get(al.size()-1)<nums[i]){
                al.add(nums[i]);
            }
            else{
                int pos=findCeilPos(al,nums[i]);
                al.set(pos,nums[i]);
            }
        }
        // System.out.println(al);
        return al.size();
    }
}
