class Solution {
    public int cntOfOnesInRow(String s){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')cnt++;
        }
        return cnt;
    }
    public int numberOfBeams(String[] bank) {
        
        int prev=0;
        int ans=0;
        
        for(int i=0;i<bank.length;i++){
            int cur=cntOfOnesInRow(bank[i]);
            


            if(cur>0){
                ans+=(prev*cur);
                prev=cntOfOnesInRow(bank[i]);
            }
        }
        return ans;
    }
}