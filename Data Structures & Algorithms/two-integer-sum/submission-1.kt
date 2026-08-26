class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val valtoindex = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val needed = target - nums[i]

            if (valtoindex.contains(needed)) {
                return intArrayOf(valtoindex[needed]!!, i)
            }

            valtoindex[nums[i]] = i
        }

        return intArrayOf()
    }
}