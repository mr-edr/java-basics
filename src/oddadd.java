import java.util.Scanner;

public class oddadd {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=s.nextInt(),t=n,sum=0,odd=0,p=1;

        while(t!=0){
            int d=t%10;
            if(d%2!=0){
                sum+=d;
                odd=d*p+odd;
                p*=10;
            }
            t/=10;
        }

        System.out.println("Sum of odd digits are "+sum+"\n Odd digits present are :"+odd);

    }
}
