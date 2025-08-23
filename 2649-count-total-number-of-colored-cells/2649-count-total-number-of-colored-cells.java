class Solution {
    public long coloredCells(int n) {
        //this below formula is dervied by my own
        /*
        1->1
        2->5
        3->13
        4->25
        6->61

        num=n+(n-1)
        for 6 ->num=11
        ans=6*11-5->=61

        */

        // long num=(long)(n+(n-1));
        // long ans=(long)(num*n-(n-1));
        // return ans;
        return (long)(n+(n-1))*n-(n-1);
    }
}