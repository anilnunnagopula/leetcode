
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        
        int left=0;
        int sum;
        int right=numbers.length-1;
        while(left<numbers.length){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                a[0]=left+1;
                a[1]=right+1;
                return a;
            }
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }

        }
        return a;
        
    }
}
//my code absolutely correct and all test cases passed
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int a[]=new int[2];
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     a[0]=i+1;
//                     a[1]=j+1;
//                     return a; 
//                 }
//             }
//         }
//         return a;
        
//     }
// }