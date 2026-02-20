public class firstsecond {
    static void main() {
        int[] arr = {22,33,89,44,89,33,44,56,77};

        int first=arr[0],second=0;
        for(int i : arr){
            if(i>first){

                second = first;
                first = i;

            } else if (i>second) {

                second=i;

            }

        }
        System.out.println("first = " + first);
        System.out.println("second = " + second);
    }
}
