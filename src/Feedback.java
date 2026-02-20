
import java.util.Scanner;

public class Feedback {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the feedback :");
        String[] feed=s.nextLine().split(",");
        int sum =0;
        for(String x : feed){
            if (x.equals("positive"))
                sum++;
            else if (x.equals("negative"))
                sum--;
        }
        System.out.println(sum);

    }
}
