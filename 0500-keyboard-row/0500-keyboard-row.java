class Solution {
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String f1 = "qwertyuiop";
        String f2 = "asdfghjkl";
        String f3 = "zxcvbnm";

        for (String word : words) {
            boolean isSubset1 = true;
            boolean isSubset2 = true;
            boolean isSubset3 = true;
            for (int i = 0; i < word.length(); i++) {
                String c = word.toLowerCase();
                char c1 =c.charAt(i);
                if (!f1.contains(Character.toString(c1))) {
                    isSubset1 = false;
                }
                if (!f2.contains(Character.toString(c1))) {
                    isSubset2 = false;
                }
                if (!f3.contains(Character.toString(c1))) {
                    isSubset3 = false;
                }
            }
                if (isSubset1 || isSubset2 || isSubset3) {
                    list.add(word);
                }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the array: ");
        String words[] = new String[n1];
        for (int i = 0; i < n1; i++) {
            words[i] = sc.next();
        }
        String[] list = findWords(words);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}