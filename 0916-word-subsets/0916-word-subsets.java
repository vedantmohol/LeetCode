class Solution {
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        final int characters[] = new int[26];
        List<String> subset = new ArrayList<>();

        for(String w : words2)
        {
            int count[] = new int[26];
            for(char c : w.toCharArray())
            {
                count[c-'a']++;
            }
            for(int i=0 ; i<26 ; ++i)
            {
                characters[i] = Math.max(characters[i],count[i]);
            }
        }
        for(String word : words1)
        {
            int count[] = new int[26];
            for(char c : word.toCharArray())
            {
                count[c-'a']++;
            }
            boolean valid = true;
            for(int i=0 ; i<26 ; ++i)
            {
                if(count[i]<characters[i])
                {
                    valid = false;
                    break;
                }
            }
            if(valid)
            {
                subset.add(word);
            }
        }
        return subset;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String words1[] = new String[n1];
        String words2[] = new String[n2];
        for(int i=0 ; i<n1 ; i++)
        {
            words1[i] = sc.next();
        }
        for(int j=0 ; j<n2 ; j++)
        {
            words2[j] = sc.next();
        }
        List<String> subset = wordSubsets(words1,words2);
        System.out.println(subset);
    }
}