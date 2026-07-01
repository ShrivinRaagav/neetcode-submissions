class Solution {
    public boolean isPalindrome(String s) {
        String st1 = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String st2 = new StringBuilder(st1).reverse().toString();
        return st1.equals(st2);
    }
}
