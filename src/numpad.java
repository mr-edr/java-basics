import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class numpad {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number with digits other than 0 & 1 , with <= 4 digits : ");
        String digits = sc.next();
        Map <Integer,String> map = Map.of(
                2,"abc",
                3,"def",
                4,"ghi",
                5,"jkl",
                6,"mno",
                7,"pqrs",
                8,"tuv",
                9,"wxyz"
        );

        List <String> output = new ArrayList<>(),temp = new ArrayList<>();
        output.add("");
        for(char i : digits.toCharArray()){
            String a = map.get(i-'0');
            for(char j : a.toCharArray()){
                for(String s : output){
                    temp.add(s+j);
                }
            }
            output = temp;
            temp=new ArrayList<>();
        }

        System.out.println("output = " + output);

    }
}
