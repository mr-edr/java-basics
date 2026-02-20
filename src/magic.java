import java.util.Scanner;

public class magic {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();

        if ( n %9==1) System.out.println("The Given Number is a Magic Number ");
        else System.out.println("The Given Number is not  a Magic Number ");

    }
}
