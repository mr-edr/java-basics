import java.util.Scanner;
public class java_p3 {
//    1
//    2 2
//    3 3 3
//    4 4 4 4
//    3 3 3
//    2 2
//    1
    static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ; i<=n ; i++){
            for(int j =1; j<=i;j++) {
                    System.out.print(i + " ");
            }
            System.out.println();
        }
        for(int i = n-1 ;  i>=1 ; i--){
            for(int j = n-1 ; j>=n-i ; j-- ){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
