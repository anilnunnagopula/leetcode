class Solution {
    public void rotate(int[] nums, int d) {
        int n=nums.length;
        d=d%n;
        int l=0,r=n-d-1;
        for(int i=0;i<(n-d)/2;i++){//or while(l<r)
            int temp=nums[l];
            nums[l++]=nums[r]; 
            nums[r--]=temp;
        }

        l=n-d;
        r=n-1;

        for(int i=0;i<(n-(n-d))/2;i++){//while(l<r)
            int temp=nums[l];
            nums[l++]=nums[r]; 
            nums[r--]=temp; 
        }


        l=0;
        r=n-1;
        for(int i=0;i<n/2;i++){
            int temp=nums[l];
            nums[l++]=nums[r]; 
            nums[r--]=temp;
        }
        
    }
}