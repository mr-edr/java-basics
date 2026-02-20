
import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word= s.nextLine();
        boolean ispal=true;
        int j = (word.length()-1);
        int i =0;
        while(j>i){
            if (word.charAt(i)!=word.charAt(j)){
                ispal= false;
                break;
            }
            j--;
            i++;
        }
        if (ispal)
            System.out.println("The given string is a palindrome");
        else 
            System.out.println("The given string is not a palindrome");
    }
}
