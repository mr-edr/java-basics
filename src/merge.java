import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements of first array :");
        List <Integer> n =Arrays.stream(s.nextLine().split(" ")).map(x-> Integer.parseInt(x)).toList();
        System.out.println("Enter elements of second list : ");
        List <Integer> n2=Arrays.stream(s.nextLine().split(" ")).map(x-> Integer.parseInt(x)).toList();
        List <Integer> merged = new ArrayList<>(n);
        merged.addAll(n2);
        System.out.println("list 1: "+n+"\nlist 2: "+n2+"\nMerged: "+merged);
    }
}
