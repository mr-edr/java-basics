
import java.util.Scanner;

public class largestarr {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the element "+ i+1+" : ");
                arr[i] = s.nextInt();
        }
        int large=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>large)
                    large= arr[i];
        }
        System.out.println("The largest number in the given array is "+ large);
    }
}
