class Solution {
    public int findComplement(int num) {
        if(num==0)
        {
            return 1;
        }
        int i=0;
        int ans=0;

        while(num!=0)
        {
            if(num%2==0)
            {
                ans += Math.pow(2,i);
            }
            i++;
            num = num/2;
        }
        return ans;
    }
}