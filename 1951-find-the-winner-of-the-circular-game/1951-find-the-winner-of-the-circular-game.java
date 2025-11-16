class Solution {
    public int findTheWinner(int n, int k) {
        
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(i+1);
        }

        int p=n;
        int curEle=0;
        while(p>1){
            int removeEle=(k+curEle-1)%p;
            l.remove(removeEle);
            curEle=removeEle;
            p--;
        }
        return l.get(0);
    }
}