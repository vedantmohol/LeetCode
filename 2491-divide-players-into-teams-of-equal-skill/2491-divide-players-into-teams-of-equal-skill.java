class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        int sum = 0;
        int teams = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            sum += skill[i];
            map.put(skill[i],map.getOrDefault(skill[i],0)+1);
        }

        int target = sum / teams;
        if(sum % teams != 0){
            return -1;
        }
        long res=0;
        for(int element : skill){
            if(map.get(element) == 0){
                continue;
            }
            map.put(element,map.get(element)-1);
            int partner = target - element;
            if(!map.containsKey(partner) || map.get(partner)==0){
                return -1;
            }
            map.put(partner,map.get(partner)-1);
            res = res + (long)element * (long)partner;
        }
        return res;
    }
}