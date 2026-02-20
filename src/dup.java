
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dup {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i <arr.length; i++) {
            System.out.print("Enter :");
            arr[i]= s.nextInt();
        }
        Set <Integer> set=new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        System.out.println("The Given Array without duplicates : "+set);
    }
}
