package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String chars, String word) {
        if (chars.length() < word.length()) {
            return false;
        }

        word = word.toLowerCase();
        chars = chars.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (chars.indexOf(word.charAt(i)) == -1) {
                return false;
            }

            chars = chars.substring(0, chars.indexOf(word.charAt(i)))
                    + chars.substring(chars.indexOf(word.charAt(i)) + 1);
        }

        return true;

    }
}
//END
