class Solution {
    public static void Generate(String curr,int open,int close,int n,List<String> l){
        if(open==n&&close==n){
            l.add(curr);
            return;
        }
        if(open<n){
            Generate(curr+"(",open+1,close,n,l);
        }
        if(close<open){
            Generate(curr+")",open,close+1,n,l);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        Generate("",0,0,n,l);
        return l;
    }
}