class Solution {
        public static double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (x == 1.0) return 1.0;
        if (x == 0.0) return 0.0;
        
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return powHelper(x, N);
    }

    private static double powHelper(double x, long n) {
        if (n == 0) 
            return 1.0; 
        double half = powHelper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        sc.close();
        
        double result = myPow(x, n);
        System.out.println(result);
    }
}