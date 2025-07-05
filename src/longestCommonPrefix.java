class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        
        int numberOfStrs = strs.length;

        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 1; j < numberOfStrs; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}
