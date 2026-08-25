class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val singleEntry = mutableSetOf<Int>()

        for (num in nums) {
            if (num in singleEntry) {
                return true
            }
            singleEntry.add(num)
        }
        return false

    }
}
