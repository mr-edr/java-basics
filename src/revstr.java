
import java.util.Scanner;

public class revstr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string :");
        String word=s.nextLine();
        String revString = "";
        for (int x=(word.length()-1); x>=0;x--){
                revString+=word.charAt(x);
        }
        System.out.println(revString);
        if (word.equals(revString))
            System.out.println(" word is a palindrome");
        else 
            System.out.println("word is not a palindrome");
    }
}
