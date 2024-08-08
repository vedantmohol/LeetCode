class Solution {
    public static int fib(int n) {
        int c=0;
        if(n==0 || n==1)
        {
            return n;
        }
        c = fib(n-1)+fib(n-2);
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = s.nextInt();
        int result = fib(n);
        System.out.print(result);

    }
}