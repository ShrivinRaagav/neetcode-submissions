class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            int n = s.charAt(i) - '0';
            int m = s.charAt(i+1) - '0';
            sum += Math.abs(n - m);
        }
        return sum;
    }
}