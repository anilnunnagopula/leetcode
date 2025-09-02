class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int r1left=rec1[0];
        int r1bot=rec1[1];
        int r1right=rec1[2];
        int r1top=rec1[3];

        int r2left=rec2[0];
        int r2bot=rec2[1];
        int r2right=rec2[2];
        int r2top=rec2[3];

        if(r1right<=r2left||r1bot>=r2top||r1left>=r2right||r1top<=r2bot){
            return false;
        }
        return true;


    }
}