public class java_p2 {


// 1
// 4    9
// 16   25    36
// 49   64    81    100
    public static void main(String[] args) {
        int s = 1;


        for(int i =0;i<=4;i++){
            for(int j=1; j<=i ;j++ ){
                System.out.print((s*s)+" ");
                s++;
            }
            System.out.println();
        }
    }
}
