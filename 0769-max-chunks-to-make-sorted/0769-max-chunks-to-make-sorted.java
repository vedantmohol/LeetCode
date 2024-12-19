class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count =0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            max = Math.max(arr[i],max);
            if(max<i+1){
                count++;
            }
        }
        return count;
    }
}