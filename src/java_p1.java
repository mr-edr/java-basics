import java.util.Scanner;

public class java_p1 {

//    1 1 1 1 1 1 1
//      2 2 2 2 2
//        3 3 3
//          4
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();


        for(int i = 1 ; i<=n ; i++) {
            for(int k = 1;k<i*2;k++) System.out.print(" ");
            for(int j =1; j<=((n-i)*2)+1;j++){

                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
