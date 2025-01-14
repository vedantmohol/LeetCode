class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int freq[] = new int[A.length+1];
        int c[] = new int[A.length];
        int count=0;
        for(int i=0 ; i<A.length ; i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                count++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                count++;
            }
            c[i] = count;
        }
        return c;
    }
}