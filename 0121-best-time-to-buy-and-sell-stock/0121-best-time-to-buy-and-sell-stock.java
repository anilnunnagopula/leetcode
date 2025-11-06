class Solution {
    public int maxProfit(int[] a) {
        
        int min=a[0];
        int p=0;
        for(int i=1;i<a.length;i++){
            min=Math.min(min,a[i]); 
            p=Math.max(p,a[i]-min); 
        } 
        return p;
    }
}