class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean mins[] = new boolean[1440];
        for(String time: timePoints){
            int h = Integer.parseInt(time.substring(0,2));
            int m = Integer.parseInt(time.substring(3,5));
            int minutes= h*60+m;
            if(mins[minutes]) {
                return 0;
            }
            mins[minutes] = true;
        }
        int prev=-1;
        int firstVal = -1;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0 ; i<1440 ; i++)
        {
            if(mins[i]){
                if(prev==-1)
                {
                    firstVal = i;
                    prev = i;
                }
                else{
                    minDiff = Math.min(minDiff,i-prev);
                    prev = i;
                }
            }
        }
        if(prev!=-1)
        {
            minDiff = Math.min(minDiff,1440+firstVal-prev);
        }
        return minDiff;
    }
}