class Solution {
    public int digitSum(int num){
       int sum=0;
       while(num!=0){
        sum += num%10;
        num /=10;
       }

       return sum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int count=0;

        for(int i=1 ; i<n+1 ; i++){
            int currSum = digitSum(i);

            if(map.containsKey(currSum)){
                map.put(currSum,map.get(currSum)+1);
            }else{
                map.put(currSum,1);
            }

            if(max < map.get(currSum)){
                count = 1;
                max = map.get(currSum);
            }else if(max == map.get(currSum)){
                count +=1;
            }
        }
        return count;
    }
}