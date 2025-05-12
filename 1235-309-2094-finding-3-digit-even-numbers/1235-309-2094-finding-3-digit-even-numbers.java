class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> unique = new HashSet<>();

        int n = digits.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                for(int k=0 ; k<n ; k++){
                    if(i==j || j==k || k==i) continue;

                    int a=digits[i];
                    int b=digits[j];
                    int c=digits[k];

                    if(a==0) continue;
                    if(c%2!=0) continue;

                    int num = a*100+b*10+c;
                    unique.add(num);
                }
            }
        }
        List<Integer> result = new ArrayList<>(unique);
        Collections.sort(result);

        int[] res = new int[result.size()];
        for(int i=0 ; i<res.length ; i++){
            res[i] = result.get(i);
        }

        return res;
    }
}