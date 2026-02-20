import java.util.Scanner;

public class box {
    static void main() {
        Scanner s = new Scanner(System.in);
        int n = 5;

        for(int i = 1;i<=5;i++){
            for(int j= 1;j<n;j++){
                if(i==1 || i==n || ((j==1 || j==n) && (i>1 && i<n))){
                    System.out.print(i+" ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
