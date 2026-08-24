class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> it = new HashSet<>();
        for(int num : nums){
            if(!it.add(num)){
                return true;
            }
        }
        return false;
    }
}