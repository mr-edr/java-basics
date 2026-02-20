
import java.util.*;
public class freq {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter : ");
            arr[i]=s.nextInt();
        }
     Map <Integer,Integer>freq = new HashMap<Integer,Integer>();
        for (int x: arr){
            freq.put(x,freq.getOrDefault(x, 0)+1);
        }
        for (int x: freq.keySet()){
            System.out.println(x + " : " + freq.get(x));
        }
    }
}
