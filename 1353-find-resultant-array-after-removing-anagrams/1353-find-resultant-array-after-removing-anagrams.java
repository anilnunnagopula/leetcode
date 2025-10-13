class Solution {
    public List<String> removeAnagrams(String[] words) {

        int n=words.length;
        String prev=words[0];
        List<String> l=new ArrayList<>();
        l.add(prev);
        for(int i=1;i<n;i++){
            String curr=words[i];
            char c1[]=prev.toCharArray();
            char c2[]=curr.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(!Arrays.equals(c1,c2)){
                l.add(curr);
                prev=words[i];
            }
        }
        return l;



    }
}