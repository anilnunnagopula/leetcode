class Solution {
    // public boolean containsAll(String s){
    //     if(s.length()<3)return false;
    //     // System.out.println(s);
    //     return s.contains("a")&&s.contains("b")&&s.contains("c");
    // }
    
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int cnt=0;


        int l=0;
        int r=0;
        int freq[]=new int[3];
        while(r<n){
            char c=s.charAt(r);
            freq[c-'a']++;

            // if(freq[0]>=1&&freq[1]>=1&&freq[2]>=1){
            //     cnt+=1+(n-r-1);
            // }
            while(l<=r&&freq[0]>=1&&freq[1]>=1&&freq[2]>=1){
                cnt+=1+(n-r-1);
                c=s.charAt(l);
                freq[c-'a']--;
                l++;
                // if(freq[0]>=1&&freq[1]>=1&&freq[2]>=1){
                // cnt+=1;
            // }
            }

            r++;
        }

        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         // System.out.println(s.substring(i,j+1));
        //         if(containsAll(s.substring(i,j+1))){
        //             cnt++;
        //         }
        //     }
        // }
        return cnt;
    }
}