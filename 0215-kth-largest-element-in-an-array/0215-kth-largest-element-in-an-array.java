class Solution {
    public void conquer(int array[],int si,int mid,int ei)
    {
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei)
        {
            if(array[idx1]<=array[idx2])
            {
                merged[x] = array[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x] = array[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid)
        {
            merged[x] = array[idx1];
            x++;
            idx1++;
        }
        while (idx2<=ei)
        {
            merged[x] = array[idx2];
            x++;
            idx2++;
        }
        for(int i=0, j=si; i<merged.length ; i++ ,j++)
        {
            array[j] = merged[i];
        }
    }
    public void divide(int array[],int si,int ei)
    {
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(array,si,mid);
        divide(array,mid+1,ei);
        conquer(array,si,mid,ei);
    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        divide(nums,0,nums.length-1);
        for(int i=0 ; i<nums.length ; i++){
            // if(!arr.contains(nums[i])){
            arr.add(nums[i]);
            // }
        }
        int n = arr.size();
        for(int i=0 ; i<n-k ; i++){
            arr.poll();
        }
        int result = arr.peek();
        return result;
    }
}