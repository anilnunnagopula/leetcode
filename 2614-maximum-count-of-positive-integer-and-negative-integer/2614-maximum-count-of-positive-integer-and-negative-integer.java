class Solution {
    public int maximumCount(int[] nums) {
        // int negCnt=0;
        // int posCnt=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0)negCnt++;
        //     if(nums[i]>0)posCnt++;
        // }
        // return negCnt>posCnt?negCnt:posCnt;

        int low=0;
        int high=nums.length-1;
        int negIdx=-1;
        int k=0;
        //lower bound
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<0){
                negIdx=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        // upper bound 
        low=0;
        high=nums.length-1;
        int posIdx=nums.length;
        k=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>0){
                posIdx=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        // System.out.println(negIdx-1);
        // System.out.println(nums.length-posIdx);
        return Math.max(negIdx+1,nums.length-posIdx);

    }
}