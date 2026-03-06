import java.util.Arrays;

public class SortByBits {
    static void main() {
        int a[] = {1024,22,11,20,13,27};
        Solution3 s = new Solution3();
        a = s.sorted(a);
        System.out.println("a = " + Arrays.toString(a));
    }
}
class Solution3{
    int[] sorted(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int bc = Integer.bitCount(a) - Integer.bitCount(b);
                    return bc != 0 ? bc : Integer.compare(a, b);
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
 }

