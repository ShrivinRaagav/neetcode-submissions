class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int source = 0;
        int target = 0;

        while(source < s.length() && target < t.length()){
            if(s.charAt(source) == t.charAt(target)){
                source++;
            }
            target++;
        }
        return source == s.length();
    }
}