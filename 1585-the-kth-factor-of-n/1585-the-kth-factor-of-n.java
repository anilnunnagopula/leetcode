class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> l=new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                l.add(i);
                if(n/i!=i){
                    l.add(n/i);
                }
            }
        }
        Collections.sort(l);
        System.out.println(l);
        return k<=l.size()?l.get(k-1):-1;
    }
}