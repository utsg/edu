package codewars.kyu6;

import java.util.Arrays;

public class ConvertToCamelCase {
    static String toCamelCase(String str) {
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length).map(
                i -> (i.substring(0, 1).toUpperCase() + i.substring(1))
        ).reduce(words[0], String::concat);
    }
}
