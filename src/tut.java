
import java.util.Scanner;

public class tut {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String:");
        String word= s.nextLine();
        int res =(int) word.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).count();
        System.out.println("There are " + res+" vowels and "+(word.length()-res)+ " consonants in " + word);
        s.close();
    }
}
