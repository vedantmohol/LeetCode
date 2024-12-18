class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> s = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            while(!s.isEmpty() && s.peek()>prices[i]){
                s.pop();
            }
            int val = prices[i];
            if(!s.isEmpty()){
                prices[i] -= s.peek();
            }
            
            s.push(val);
        }

        return prices;
    }
}