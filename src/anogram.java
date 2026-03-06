import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anogram {
    static void main() {
        String s1 = "doom",s2= "mood";

        String sorteds1 = s1.chars()
                .mapToObj(c -> (char)c)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());

        String sorteds2 = s2.chars()
                .mapToObj(c -> (char)c)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());

        if(sorteds1.equals(sorteds2)){
            System.out.println("They are anagrams");
        }
        else System.out.println("They are not anagrams");




    }
}
