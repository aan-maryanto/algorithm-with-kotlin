package strings

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestNonRepeativeSubstringTest {

    @Test
    fun palindrome() {
        val inputOne = "HelloWorld"
        val inputTwo = "JavaIsAProgrammingLanguage"
        assertEquals(5, lengthOfLongestSubstring(inputOne))
        assertEquals(9, lengthOfLongestSubstring(inputTwo))
    }
}