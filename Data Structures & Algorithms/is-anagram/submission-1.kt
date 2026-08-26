class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val counts = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            counts[s[i]] = (counts[s[i]] ?: 0) + 1
            counts[t[i]] = (counts[t[i]] ?: 0) - 1
        }

        return counts.values.all { it == 0 }
    }
}