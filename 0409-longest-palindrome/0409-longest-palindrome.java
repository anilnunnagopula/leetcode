class Solution {
    public int longestPalindrome(String s) {
        int cnt[]=new int[52];
        // s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='A'&&ch<='Z'){
                cnt[s.charAt(i)-'A']++;
            }
            else if(ch>='a'&&ch<='z'){
                cnt[s.charAt(i)-'a'+26]++;
            }

        }

        boolean containsOdd=false;
        int total=0;
        for(int i=0;i<52;i++){
            if(cnt[i]%2==1){
                containsOdd=true;
            }
            

            if(cnt[i]%2==0){
                total+=cnt[i];
            }
            else if(cnt[i]%2==1){
                total+=(cnt[i]-1);
            }

        }
        return containsOdd?total+1:total;



    }
}