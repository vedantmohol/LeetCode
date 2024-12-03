class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder newStr = new StringBuilder(s);
        int extra = 0;
        for(int spaceIndex : spaces){
            newStr.insert(spaceIndex+extra," ");
            extra++;
        }
        return newStr.toString();
    }
}