import java.util.Arrays;

public class maxsub {
    static int max(int[] a){
        int m = Integer.MIN_VALUE;
        System.out.println("Max of "+Arrays.toString(a));
        for (int  i : a){
            if(m<i) m=i;
        }
        return m;
    }

    static void main() {
        int arr[] = {10,5,2,7,8,7};
        int d = 3,i=0,j=d;

        while(j<=arr.length){
            int b[] = new int[d];
            for(int k = i;k<j;k++){
                b[k-i]=arr[k];
            }
            System.out.println(max(b));
            i++;
            j++;
        }

    }
}
