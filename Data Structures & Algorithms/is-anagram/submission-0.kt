class Solution {

    data class CharEntry(
        var first: Int = 0,
        var second: Int = 0
    )

    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) {
            return false
        }

        val charEntry = mutableMapOf<Char, CharEntry>()

        for (i in 0 until s.length) {

            val s1c = s[i]
            val s2c = t[i]

            val preEntryS1 = charEntry[s1c]

            val updateS1: CharEntry =
                if (preEntryS1 == null) {
                    CharEntry(1, 0)
                } else {
                    CharEntry(
                        preEntryS1.first + 1,
                        preEntryS1.second
                    )
                }

            charEntry[s1c] = updateS1

            val preEntryS2 = charEntry[s2c]

            val updateS2: CharEntry =
                if (preEntryS2 == null) {
                    CharEntry(0, 1)
                } else {
                    CharEntry(
                        preEntryS2.first,
                        preEntryS2.second + 1
                    )
                }

            charEntry[s2c] = updateS2
        }

        charEntry.forEach { (_, value) ->
            if (value.first != value.second) {
                return false
            }
        }

        return true
    }
}