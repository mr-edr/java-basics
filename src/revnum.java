import java.util.Scanner;

public class revnum {
    static void main() {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number ");
        int n= s.nextInt(),t=n,rev=0;

        while(t!=0){
            rev=(rev*10)+(t%10);
            t/=10;
        }

        System.out.println("The reverse of the given number "+n+" is "+rev);
    }
}
