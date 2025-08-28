class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();

        for(int i=m-1;i>0;i--){
            int r=0;
            int c=i;
            ArrayList<Integer> al=new ArrayList<>();
            while(r<m&&c<n){
                al.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(al);
            r=0;
            c=i;
            // ArrayList<Integer> al=new ArrayList<>();
            while(r<m&&c<n){
                grid[r][c]=al.get(r);
                r++;
                c++;
            }
        }
        
        for(int i=0;i<m;i++){
            int r=i;
            int c=0;
            ArrayList<Integer> al=new ArrayList<>();
            while(r<m&&c<n){
                al.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(al,Collections.reverseOrder());
            r=i;
            c=0;
            // ArrayList<Integer> al=new ArrayList<>();
            while(r<m&&c<n){
                grid[r][c]=al.get(c);
                r++;
                c++;
            }
        }
        return grid;
    }
}