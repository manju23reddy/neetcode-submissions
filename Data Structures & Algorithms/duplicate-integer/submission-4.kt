class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val singleEntry = mutableSetOf<Int>()

        nums.forEach {
            if (singleEntry.contains(it))
                return true
            else
                singleEntry.add(it)
        }
        return false

    }
}
