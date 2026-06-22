class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Set<Integer>hsh = new java.util.HashSet<>();
        for(int i:nums){
            if(!hsh.add(i)){
                return true;
            }
        }
        return false;
    }
}