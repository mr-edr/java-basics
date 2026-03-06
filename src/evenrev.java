import java.util.Arrays;
public class evenrev {

    static void main() {

        int a[] = {5,10,15,20,25,30,35,40};

        int i = 0, j = a.length - 1;

        while(i < j){
            while(i < j && a[i] % 2 != 0)
                i++;
            while(i < j && a[j] % 2 != 0)
                j--;
            if(i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}