package leetcode.strings;

public class ReverseInteger {
    public int reverse(int x) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            if (x < 0) {
                sb = new StringBuilder(String.valueOf(x * -1));
                return Integer.parseInt(sb.reverse().toString()) * -1;
            }
            return Integer.parseInt(sb.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
