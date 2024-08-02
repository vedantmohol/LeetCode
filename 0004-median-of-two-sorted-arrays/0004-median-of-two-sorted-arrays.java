class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int arr3[] = new int[nums1.length+ nums2.length];
      for (int i=0 ; i<(nums1.length) ; i++)
      {
          arr3[i] = nums1[i];
      }
        for (int i= 0 ; i<nums2.length ; i++)
        {
            arr3[nums1.length+i] = nums2[i];
        }
        for(int i=0 ; i< arr3.length-1 ; i++)
        {
            for (int j=0 ; j< arr3.length-i-1 ; j++)
            {
                if(arr3[j]>arr3[j+1])
                {
                    int temp = arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }
        if(arr3.length%2!=0)
        {
            return arr3[arr3.length/2];
        }
        else {
            float s1 = arr3[arr3.length/2-1];
            float s2 = arr3[arr3.length/2];
            float median = (s1 + s2)/2;
            return median;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array1: ");
        int size = sc.nextInt();
        int nums1[] = new int[size];
        System.out.print("Enter the array1 elements: ");
        for (int i=0 ; i<size ; i++)
        {
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter the length of array2: ");
        int size2 = sc.nextInt();
        int nums2[] = new int[size2];
        System.out.print("Enter the array1 elements: ");
        for (int i=0 ; i<size2 ; i++)
        {
            nums2[i] = sc.nextInt();
        }

        double result = findMedianSortedArrays(nums1,nums2);
        System.out.print(result);
    }

}