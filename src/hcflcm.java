
import java.util.Scanner;

public class hcflcm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter N1: ");
        int n1=s.nextInt();
        System.out.print("Enter N2: ");
        int n2=s.nextInt();
        int gcd =n1;
        int t = n2;
        while(t!=0){
            int t1=t;
            t=gcd%t;
            gcd=t1;
        }
        s.close();
        int lcm = (n1*n2)/gcd;
        System.out.println("GCD : "+ gcd+" , LCM : "+lcm);
    }
}
