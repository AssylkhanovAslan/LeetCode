import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

public class LetterCombinationsOfPhoneNumber {

    private static final String[] LETTER_MAPPINGS = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }
        return letterCombinationsHelper(Collections.singletonList(""), digits);
    }

    private static List<String> letterCombinationsHelper(List<String> currentCombinations, String digitsLeft) {
        if (digitsLeft == null || digitsLeft.length() == 0) {
            return currentCombinations;
        }

        List<String> updatedCombinations = new ArrayList<>();
        int currDigitIndex = digitsLeft.charAt(0) - 48 - 2;
        digitsLeft = digitsLeft.substring(1);
        String lettersToAppend = LETTER_MAPPINGS[currDigitIndex];

        for (int i = 0; i < currentCombinations.size(); i++) {
            for (int j = 0; j < lettersToAppend.length(); j++) {
                char letterToAppend = lettersToAppend.charAt(j);
                String newCombination = currentCombinations.get(i) + letterToAppend;
                updatedCombinations.add(newCombination);
            }
        }

        return letterCombinationsHelper(updatedCombinations, digitsLeft);

    }
}
