class Solution {
    public int firstUniqChar(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']+=1;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i); 
            if(a[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
    //   TreeSet<Character> set =new TreeSet<>();
    //   int p=0;
    //   boolean flag=true;
    //   for(char c:s){
    //     if(set.contains(c)){
    //         flag=false;
    //     }
    //     if(flag){
    //         return p;
    //     }
    //     set.add(c)
    //     p++;
    //   }  
//     }
// }