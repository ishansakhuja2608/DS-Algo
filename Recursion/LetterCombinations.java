package Recursion;

public class LetterCombinations {
    static String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static void combinations(String in, String res) {
        if (in.length() == 0) {
            System.out.println(res);
            return;
        }

        char currDigitChar = in.charAt(0);

        int currDigitInt = currDigitChar - '0'; // we get integer num if we subtract 0 character from number character
                                                // //
        // Character.getNumericValue(currDigit); this can also be used

        String mappedString = mapping[currDigitInt]; // will get the particular element from the string

        for (int i = 0; i < mappedString.length(); i++) {
            combinations(in.substring(1), res + mappedString.charAt(i));
        }
    }

    public static void main(String[] args) {
        combinations("23", "");
    }
}
