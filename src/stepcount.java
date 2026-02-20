
import java.util.Scanner;

public class stepcount {
    public static int step(int N ){
        int c=1;
        if (N==0)
            return 0;
        else if (N%5==0)
            return c+step(N/5);
        else if (N%3 ==0)
            return c+step(N/3);
        else if (N%2==0)
            return c+step(N/2);
        else 
            return c+step(N-1);
    }
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = s.nextInt();
        int result = step(N);
        System.out.println("It takes "+result+" Steps to make "+N+" as 0");
        
    }
    
}