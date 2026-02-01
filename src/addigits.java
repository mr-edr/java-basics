import java.util.Scanner;

public class addigits {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt(),t=n,sum=0;
        while(t!=0){
            sum+=t%10;
            t/=10;
        }
        System.out.println("The Sum of all the digits in "+n+" is "+sum);
    }
}
