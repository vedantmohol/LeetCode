class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int temp=x;
        int reverse=0;
        while(temp!=0)
        {
            int remainder = temp%10;
            reverse = reverse * 10 + remainder;
            temp = temp/10;
        }
        if(reverse==x)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}