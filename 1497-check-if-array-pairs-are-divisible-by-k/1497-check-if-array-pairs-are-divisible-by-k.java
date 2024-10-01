class Solution {
    public boolean canArrange(int[] arr, int k) {
        int map[] = new int[k];
        for(int element : arr){
            int remainder = ((element%k)+k)%k;
            map[remainder]++;
        }
        if(map[0]%2!=0){
            return false;
        }
        for(int remainder=1 ; remainder<=k/2 ; remainder++){
            int complement = k - remainder;
            if(map[remainder]!=map[complement]){
                return false;
            }
        }
        return true;
    }
}