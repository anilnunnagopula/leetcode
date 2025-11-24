class Solution {
    public void recursiveHelper(List<List<Integer>> l,ArrayList<Integer> al,int n,int target,int a[],int curIdx){
        if(curIdx>=n||target<0){
            return;
        }

        if(target==0){
            l.add(new ArrayList<>(al));
            // al.remove(al.size()-1);
            return;
        }
        al.add(a[curIdx]);


        recursiveHelper(l,al,n,target-a[curIdx],a,curIdx);
        al.remove(al.size()-1);
        recursiveHelper(l,al,n,target,a,curIdx+1);

    }
    public List<List<Integer>> combinationSum(int[] a, int target) {
        List<List<Integer>> l=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        int n=a.length;
        recursiveHelper(l,al,n,target,a,0);
        return l;
    }
}