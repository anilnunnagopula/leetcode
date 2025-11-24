class Solution {
    public void recursiveHelper(List<List<Integer>> l,ArrayList<Integer> al,int a[],int n,int t,int start){
        

        if(t==0){
            l.add(new ArrayList<>(al));
            return;
        }

        for(int i=start;i<n;i++){
            if(i>start&&a[i]==a[i-1]){
                continue;//to skip duplicates
            }
            if(a[i]>t){
                break;
            }
            al.add(a[i]);
            recursiveHelper(l,al,a,n,t-a[i],i+1);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        List<List<Integer>> l=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        int n=a.length;
        Arrays.sort(a);
        recursiveHelper(l,al,a,n,target,0);
        return l;
    }
}

/*class Solution {
    public void recursiveHelper(List<List<Integer>> l,ArrayList<Integer> al,int a[],int n,int t,int curIdx){
        

        if(t==0){
            // if(!l.contains(al))
            ArrayList<Integer> copy=new ArrayList<>(al);
            Collections.sort(copy);
            if(!l.contains(copy))
            l.add(new ArrayList<>(copy));
            return;
        }
        if(curIdx>=n||t<0){
            return;
        }
        al.add(a[curIdx]);
        recursiveHelper(l,al,a,n,t-a[curIdx],curIdx+1);
        al.remove(al.size()-1);
        recursiveHelper(l,al,a,n,t,curIdx+1);
    }
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        List<List<Integer>> l=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        int n=a.length;
        Arrays.sort(a);
        // for(int i=0;i<n;i++){
            recursiveHelper(l,al,a,n,target,0);
        // }
        return l;
    }
}
*/
