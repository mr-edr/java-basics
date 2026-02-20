
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =s.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n%i==0)
                    isPrime=false;
        }
        if (isPrime)
            System.out.println(n+ " is prime.");
        else 
            System.out.println(n+" is not prime.");

    }
}
