import java.util.Scanner;

public class arangement {
    static void main() {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=s.nextInt(),t=n,oc=0,ec=0,on=0,en=0,op=1,ep=1;

        while(t!=0){
            int d=t%10;
            if(d%2==0){
                ec+=1;
                en=d*ep+en;
                ep*=10;
            }
            else {
                oc+=1;
                on=d*op+on;
                op*=10;
            }
            t/=10;
        }
        System.out.println("The numbers in the required arangement , odd-oddcount-even-evencount : "+on+oc+en+ec);
    }
}
