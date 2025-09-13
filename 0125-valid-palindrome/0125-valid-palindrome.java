class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        String S=s.toLowerCase();
        //System.out.println(S);
         String s1="";
         char ca[]=S.toCharArray();
        for(int i=0;i<ca.length;i++){
            if(ca[i]>='a'&&ca[i]<='z'){
                sb.append(ca[i]);
                s1+=Character.toString(ca[i]);
            }
            else if(ca[i]>='0'&&ca[i]<='9'){
                sb.append(ca[i]);
                s1+=Character.toString(ca[i]);
            } 
        }
        
        sb.reverse();
        String check=sb.toString();
        // System.out.println(s1+"  "+check);
        boolean ans=check.equals(s1);
        return ans;
        
        
    }
}