//Program to count the characters which has lower followed by higher
//        Input="accept Van"
//Output=2
public class countlu {
    static void main() {
        String Input = "accept Van";
        int count = 0;
        for (int i = 0; i < Input.length()-1; i++) {
            if(Character.isUpperCase(Input.charAt(i)) && Character.isLowerCase(Input.charAt(i+1))) count +=2;
        }
        System.out.println("count = " + count);
    }
}
