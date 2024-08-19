public class Solution {
    public static int minSteps(int n) {
        int operations = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                operations = operations + i;
                n =n/ i;
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Minimum number of operations: " + minSteps(n));
    }
}
