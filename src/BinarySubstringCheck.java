import java.util.HashSet;

public class BinarySubstringCheck {

    public static boolean hasAllCodes(String s, int k) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            set.add(sub);
        }

        int total = (int) Math.pow(2, k);

        return set.size() == total;
    }

    public static void main(String[] args) {

        System.out.println(hasAllCodes("00110110", 2)); // true
        System.out.println(hasAllCodes("0110", 1));     // true
        System.out.println(hasAllCodes("0110", 2));     // false
    }
}