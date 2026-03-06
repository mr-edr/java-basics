//Program to reverse either odd or even position based on the input
//inp1="chennaicity"
//inp2="odd"
//Output:ctecnainihy
public class odevenrev {
        public static void main(String[] args) {

            String inp1 = "chennaicity";
            String inp2 = "odd";
            char[] arr = inp1.toCharArray();
            int left, right;

            if(inp2.equals("odd")) {
                left = 0;
                right = arr.length - 1;

                if(right % 2 != 0) right--;
            }
            else {
                left = 1;
                right = arr.length - 1;

                if(right % 2 == 0) right--;
            }

            while(left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left += 2;
                right -= 2;
            }

            System.out.println(new String(arr));
        }
}
