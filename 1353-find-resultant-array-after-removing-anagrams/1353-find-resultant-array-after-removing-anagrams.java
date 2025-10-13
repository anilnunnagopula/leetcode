class Solution {
    public List<String> removeAnagrams(String[] words) {
        // LinkedHashSet<String> set=new LinkedHashSet<>();
        // List l=new ArrayList<>();
        // for(int i=0;i<words.length;i++){
        //     StringBuilder sb=new StringBuilder(words[i]);
        //     // sb.sort();
        //     char[] ch = words[i].toCharArray();  // convert to char array
        //     Arrays.sort(ch);                     // sort the characters
        //     String sorted = new String(ch);      // back to string
        //     if(set.contains(sorted)){

        //     }
        //     else{
        //         l.add(words[i]);
        //     }
        //     set.add(sorted);   
        //     // set.add(sb.toString());
        // }
        // // for(String s:set){
        // //     l.add(s);
        // // }
        // return l;

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