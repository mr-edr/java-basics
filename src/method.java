import java.util.Arrays;

public class method {
    public static void main(String[] args) {
        Arrays.stream(String.class.getDeclaredMethods()).map(n -> n.getName()).forEach(n -> System.out.print(n+"\t"));
    }
}
