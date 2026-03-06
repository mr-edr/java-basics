import java.util.Arrays;
import java.util.Scanner;

public class jagged3d {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][][] a ;

        System.out.print("Enter Number of schools : ");
        a= new int[sc.nextInt()][][];

        for (int i = 0; i < a.length ; i++) {
            System.out.printf("Enter the Number of classes in School %d : ",i);
            a[i]=new int[sc.nextInt()][];
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j <a[i].length ; j++) {
                System.out.printf("Enter the Number of Students in School-%d Class-%d :",i,j);
                a[i][j]=new int[sc.nextInt()];
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.printf("Enter the mark of Student-%d of Class-%d of School-%d : ",k,j,i);
                    a[i][j][k]=sc.nextInt();
                }
            }

        }

        System.out.println(Arrays.deepToString(a));





    }
}
