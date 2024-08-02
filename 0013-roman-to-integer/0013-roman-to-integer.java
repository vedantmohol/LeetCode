class Solution {
public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = getValue(s.charAt(i));
            int nextValue = 0;

            if (i + 1 < s.length()) {
                nextValue = getValue(s.charAt(i + 1));
            }
            if (nextValue > currentValue) {
                sum += (nextValue - currentValue);
                i++; 
            } else {
                sum += currentValue;
            }
        }
        return sum;
    }

    private static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman string: ");
        String roman = sc.next();

        int result = romanToInt(roman);
        System.out.println(result);
    }

}