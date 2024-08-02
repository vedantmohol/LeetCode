class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0 ; i<nums.length ; i++)
        {
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int target= scanner.nextInt();
        int size = scanner.nextInt();
        int nums[] = new int[size];
        
        for(int i=0 ; i<size ; i++)
        {
            nums[i] = scanner.nextInt();
        }

        int result[] = twoSum(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");

    }
}