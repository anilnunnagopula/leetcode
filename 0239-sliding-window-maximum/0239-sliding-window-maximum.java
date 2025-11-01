import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];
        Deque<Integer> dq=new LinkedList<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            while (!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        int res[]=new int[n-k+1];
        int p=0;
        res[p++] = nums[dq.peekFirst()];

        for(int i=k;i<n;i++){

            if(dq.peekFirst()==i-k){
                dq.pollFirst();
            }
            
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            res[p++] = nums[dq.peekFirst()];
        }
        return res;
    }
    
}

//         int n = nums.length;
//         int[] results = new int[n - k + 1];
//         int p = 0;
//         PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0;i<n;i++){
//             pq.add(nums[i]);
//             if(i>=k-1){
//                 results[p++]=pq.peek();
//                 pq.remove(nums[i-k+1]);
//             }
//         }
//            return results;
//     }
// }   
        // Deque<Integer> deque = new LinkedList<>();
        // for (int i = 0; i < n; i++) {
        //     // Remove indices that are out of the current window
        //     if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
        //         deque.pollFirst();
        //     }
        //     // Remove indices from the back while the current element is larger
        //     while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
        //         deque.pollLast();
        //     }
        //     // Add the current element's index to the deque
        //     deque.offerLast(i);
        //     // The maximum element for the window is at the front of the deque
        //     if (i >= k - 1) {
        //         results[p++] = nums[deque.peekFirst()];
        //     }
        // }
//         return results;
//     }
// }


//class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
         
//         if (nums == null || nums.length == 0) return new int[0];
//         for(int i=0;i<k;i++){ 
//             pq.add(nums[i]);
//         }

//         int max=0;
//         max=pq.peek(); 
//         int n=nums.length;
       
//         int a[]=new int[n-k+1];

//         int l=0,r=k; 
//         int p=1;
//         a[0]=max; 


//         while(r<n){
//             pq.remove(nums[l++]);

//             pq.add(nums[r++]);

//             a[p++]=pq.peek(); 
 
//         }
//         return a;
        
//     }
// }