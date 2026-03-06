//Progarm to reverse the given string without changing the delimiters or
//special symbols
//Input="Vision,tranz It :  Solutions"
//Output="snoitu,loStI zn :  artnoisiV"

public class revdem {

    public static void main(String[] args) {

        String s = "Vision,tranz It :  Solutions";

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            if(!Character.isLetter(arr[left])){
                left++;
            }
            else if(!Character.isLetter(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
    }
}