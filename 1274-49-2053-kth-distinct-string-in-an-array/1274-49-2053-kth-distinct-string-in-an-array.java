class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinct = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
    

        for( String str : arr){
            if(duplicate.contains(str)){
                continue;
            }

            if(distinct.contains(str)){
                distinct.remove(str);
                duplicate.add(str);
            }else{
                distinct.add(str);
            }
        }

        for(String str : arr){
            if(distinct.contains(str)){
                k--;
            }
            if(k==0){
                return str;
            }
        }

        return "";  
    }
}