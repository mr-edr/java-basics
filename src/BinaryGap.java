import java.util.Scanner;

public class BinaryGap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        Solution2 obj = new Solution2();
        int result = obj.binaryGap(n);

        System.out.println("Binary Gap = " + result);
    }
}

class Solution2 {

    public int binaryGap(int n) {

        int prev = -1;
        int maxGap = 0;
        int pos = 0;

        while(n > 0){

            if((n & 1) == 1){

                if(prev != -1){
                    maxGap = Math.max(maxGap, pos - prev);
                }

                prev = pos;
            }

            pos++;
            n >>= 1;
        }

        return maxGap;
    }
}