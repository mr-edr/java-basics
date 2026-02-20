
import java.util.HashSet;
import java.util.Set;
public class special {
    public static int fact(int n){
        if (n==0)
                return 1;
        else 
            return (n*fact(n-1));
    }
    public static void main(String[] args) {
        int[] arr = {1226,36,340};
        for(int i:arr){
            int sum=0;
            int t=i;
            int t1=0;
            Set<Integer> u=new HashSet<>();
            while(t>10){
                sum=0;
                while(t!=0){
                    sum+=t%10;
                    t=t/10;
                }
                t=sum;
            }
            t=i;
            while(t!=0){
                u.add(t%10);
                t/=10;
            }
            System.out.println(i+" "+sum);
            int f=fact(sum);
            t=f;
            Set<Integer> u1=new HashSet<>();
            while(t!=0){
                u1.add(t%10);
                t/=10;
            }
            boolean special=true;
            for(int j:u){
                if (!u1.contains(j)){
                    special = false;
                }
                    
            }
            if (special)
                System.out.println(i);

            
        }

    }
}
