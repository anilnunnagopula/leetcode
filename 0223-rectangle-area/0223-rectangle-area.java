class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int areaA=(ax2-ax1)*(ay2-ay1);
        int areaB=(bx2-bx1)*(by2-by1);


        int overlapx1=Math.max(ax1,bx1);
        int overlapy1=Math.max(ay1,by1);

        int overlapx2=Math.min(ax2,bx2);
        int overlapy2=Math.min(ay2,by2);

        int overlapArea=Math.max(0,(overlapx2-overlapx1))*Math.max(0,(overlapy2-overlapy1));


        int totalArea=areaA+areaB-overlapArea;
        return totalArea;
    }
}