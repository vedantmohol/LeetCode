class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1=0,count2=0;

        for(int i=0 ; i<nums1.length ; i++){
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i]==nums2[j]){
                    count1++;
                    break;
                }
            }
        }

        for(int i=0 ; i<nums2.length ; i++){
            for(int j=0 ; j<nums1.length ; j++){
                if(nums2[i]==nums1[j]){
                    count2++;
                    break;
                }
            }
        }

        int res[] = new int[2];
        res[0] = count1;
        res[1] = count2;

        return res;
    }
}