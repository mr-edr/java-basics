
import java.util.Scanner;

public class nprime {

    public static  boolean isprime (int i){
        for (int j = 2; j <= (int) Math.sqrt(i); j++) {
            if (i%j==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = s.nextInt();
        try{
            int[] np = new int[n];
            np[0]=2;
            for (int i=1;i<n;i++){
                for (int j=(i==1)?3:np[i-1]+2;true;j++){
                    if (isprime(j)){
                        np[i]=j;
                        break;
                    }
                }
            }
            for(int x: np){
                System.out.println(x);
            }
        }
        catch(RuntimeException e){
            System.out.println("Invalid input ! " + e.getLocalizedMessage());
        }
    }
    
}

