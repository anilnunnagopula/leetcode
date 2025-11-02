class Solution {
    public void markFunction(int a[][],int m,int n,int i,int j){
        int p=i;
        int q=j+1;
        //right
        while(q<n&&a[p][q]!=-1&&a[p][q]!=1){
            a[p][q]=2;
            q++;
        }
        //down
        p=i+1;
        q=j;
        while(p<m&&a[p][q]!=-1&&a[p][q]!=1){
            a[p][q]=2;
            p++;
        }
        
        p=i;
        q=j-1;
        //left
         while(q>=0&&a[p][q]!=-1&& a[p][q] != 1){
            a[p][q]=2;
            q--;
        }
        //up
        p=i-1;
        q=j;
        while(p>=0&&a[p][q]!=-1&& a[p][q] != 1){
            a[p][q]=2;
            p--;
        }


    }
    public int countUnguarded(int m, int n, int[][] g, int[][] w) {
        int a[][]=new int[m][n];

        for(int i=0;i<g.length;i++){
            int p=g[i][0];
            int q=g[i][1];
            a[p][q]=1;//1 for guard present at that point
        }
        for(int i=0;i<w.length;i++){
            int p=w[i][0];
            int q=w[i][1];
            a[p][q]=-1;//-1 for wall present at that point
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    markFunction(a,m,n,i,j);
                }
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}