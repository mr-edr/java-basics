
import java.util.Scanner;

public class Title{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word=s.nextLine();
        StringBuilder title = new StringBuilder();
        title.append(Character.toUpperCase(word.charAt(0)));
        for (char x: word.substring(1).toCharArray()){
        title.append(Character.toLowerCase(x));
       }
       System.out.println(title);
       s.close();
    }
}