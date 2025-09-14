class Solution {
    public boolean judgeCircle(String moves) {
        int dirI=0;
        int dirJ=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                dirI+=1;
            }
            else if(ch=='D'){
                dirI-=1;
            }
            else if(ch=='R'){
                dirJ+=1;
            }
            else if(ch=='L'){
                dirJ-=1;
            }
        }
        return dirI==0&&dirJ==0;
    }
}