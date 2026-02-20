import java.util.*;
public class leapyear{
    public static void main(String args[]){
        System.out.print("Hello,This is an leapyear finder\nEnter the year :");
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        if (a%4==0 ){
            System.out.println("LEAP year");
        }
        else{
            System.out.println("NOT LEAP year");
        }
    }
}