class Solution {
    public int[] sumZero(int n) {
        int ar[]=new int[n];
        int p=0;
        int x=0;
        while(p<n){
            if(p==0&&n%2==1)ar[p++]=x;
            else{ 
                x++;
                if(p<n)ar[p++]=x;
                if(p<n)ar[p++]=-x;
                // x++;
            }

        }
        return ar;


    }
}