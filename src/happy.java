import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class happy {
    public static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = s.nextInt(),t=n,sum=0;
        Set <Integer> set = new HashSet<>();

        set.add(n);

        while(t!=0){
            int d= t%10;
            sum+=d*d;
            t/=10;
            if(t==0){
                if(sum==1){
                    System.out.println(n+" is a happy number");
                    //break;
                }
                else if(set.contains(sum)){
                    System.out.println(n+" is not a happy number");
                    //break;
                }
                else{
                    set.add(sum);
                    t=sum;
                    sum=0;
                }
            }
        }
    }
}
