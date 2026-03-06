import java.util.Arrays;
import java.util.Scanner;

public class drotarr {
    void main() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d = 4, i = 0, j = d;
        for (int k = 0; k < 2; k++) {

            while (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
                i++;
            }

            i = d + 1;
            j = a.length - 1;
        }

        System.out.println(Arrays.toString(a));
    }
}
