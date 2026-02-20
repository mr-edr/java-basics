import java.util.Scanner;
public class wordcount {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if(a==' ' && count == 0 ) continue;
            else if ( (a == ' ' && i+1<s.length() && s.charAt(i+1)!=' ') || (a!=' ' && count == 0 )) count ++;

        }

        System.out.println("count = " + count);
    }
}
