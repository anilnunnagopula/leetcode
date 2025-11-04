class Solution {
    //copied lamda function from chatgpt
    public int[] findXSum(int[] a, int k, int x) {
        int n=a.length;
        int ans[]=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            // int a[]=new int[50];//i+k
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<i+k;j++){
                map.put(a[j],map.getOrDefault(a[j],0)+1);
            }
            List<Map.Entry<Integer, Integer>> al = new ArrayList<>(map.entrySet());
            // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //     al.add(new int[]{entry.getKey(), entry.getValue()});
            // }
            al.sort((entry1, entry2) -> {
                if (!entry1.getValue().equals(entry2.getValue())) {
                    return entry2.getValue().compareTo(entry1.getValue()); // Sort by frequency descending
                } else {
                    return entry2.getKey().compareTo(entry1.getKey()); // Sort by value descending
                }
            });
            int sum=0;


            for(int j=0;j<Math.min(x,al.size());j++){
                sum += al.get(j).getKey() * al.get(j).getValue();
            }
            // Collections.sort(al,Collections.reverseOrder());
            // int sum=0;
            // int cnt=0;
            // for(int j=i;j<i+k;j++){
            //     if(map.get(a[j])>=x){
            //         sum+=(map.get(a[j])*a[j]);
            //         cnt++;
            //     }
            // }
            // int c=0;
            // while(cnt<x){
            //     sum+=al.get(c);
            //     cnt++;
            //     c++;
            // }
            ans[i]=sum;
        }
        return ans;
    }
}