class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count = 0, sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<banned.length ; i++){
            set.add(banned[i]);
        }
        for(int i=1 ; i<=n ; i++){
            if(set.contains(i)){
                continue;
            }
            sum +=i;
            if(sum>maxSum){
                break;
            }
            count++;
        }
        return count;
    }
}