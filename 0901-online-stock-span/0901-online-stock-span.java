class StockSpanner {
    Stack<Integer> st=new Stack<>();
    public static int i;
    ArrayList<Integer> al=new ArrayList<>();

    public StockSpanner() {
        i=0;
    }
    
    // ArrayList<Integer> span=new ArrayList<>();
    
    public int next(int price) {
        int ans=0;

        while(!st.isEmpty()&&al.get(st.peek())<=price){
            st.pop();
        }
        if(st.isEmpty()){
            ans= i+1;
        }
        else{
            ans=i-st.peek();
        }
        st.push(i);
        al.add(price);
        i++;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */