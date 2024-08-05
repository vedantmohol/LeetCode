class Solution {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

                for (int i=0 ; i<words.length ; i++)
                {
                    if(words[i].indexOf(x) != -1)
                    {
                       list.add(i);
                    }
                }
            return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String words[] = new String[size];
        for (int i=0 ; i<size ; i++)
        {
            words[i] = sc.next();
        }
        char x = sc.next().charAt(0);
        List<Integer> result = findWordsContaining(words,x);
        System.out.print(result);
    }
}