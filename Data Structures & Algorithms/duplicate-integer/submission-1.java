class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>occurance = new HashSet<>();
        for (int i : nums) { 
            if (occurance.contains(i)) {
                return true;
            } 
            occurance.add(i);
        }

        return false;
    }
}