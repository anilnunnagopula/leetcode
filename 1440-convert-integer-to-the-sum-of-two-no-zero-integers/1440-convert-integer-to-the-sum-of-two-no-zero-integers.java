class Solution {
    public boolean containsZero(int a,int b){
        String as=String.valueOf(a);
        String bs=String.valueOf(b);
        return (as.indexOf('0')==-1&&bs.indexOf('0')==-1);
    }
    public int[] getNoZeroIntegers(int n) {
        int a=1;
        int b=n-1;

        for(int i=1;i<n;i++){
            if(containsZero(i,n-i)){
                return new int[]{i,n-i};
            }
        }
        return new int[]{};
    }
}