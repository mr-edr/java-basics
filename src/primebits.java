import java.util.Scanner;

public class primebits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Left : ");
        int left = sc.nextInt();
        System.out.print("Enter Right : ");
        int right = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.countPrimeSetBits(left, right);

        System.out.println("Count of numbers with prime set bits: " + result);
    }
}

class Solution {

    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for(int i = left; i <= right; i++){
            int set = Integer.bitCount(i);

            if(isPrime(set))
                count++;
        }

        return count;
    }

    boolean isPrime(int n){
        if(n < 2) return false;

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}