class Solution {
    public static void helper(StringBuilder sb,int n){
        while(n>0){
            sb.append("a");
            n--;
        }

    }
    public String generateTheString(int n) {
        
        StringBuilder sb=new StringBuilder();
        if(n%2==0){
            helper(sb,n-1);
            sb.append("z");

        }
        else{
            helper(sb,n);
        }
        return sb.toString();
    }
}