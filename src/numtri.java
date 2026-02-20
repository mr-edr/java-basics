import java.util.Scanner;

public class numtri {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){



            for(int j=1;j<=n;j++){
               if(j<=n-i) System.out.print("  ");
               else System.out.print(" " +j);

            }
            System.out.println();
        }
    }
}
