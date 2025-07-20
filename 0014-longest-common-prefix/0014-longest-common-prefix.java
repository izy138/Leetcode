class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        //make the first word in the array the prefix
        String prefix = strs[0];
//
        //check each word in the array against prefix
        for (int i = 1; i < strs.length; i++) {
            //while the string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.length() == 0) {
                return "";
            }
        }
        return prefix;
    }
}
