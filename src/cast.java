public class cast {
    public static double area(double a ){
        System.out.println("double : " );
        return a*a;
    }

    public static int area(int a ){
        System.out.println("int : " );
        return a*a;
    }

    static void main() {
        System.out.println(area(4));
        System.out.println(area(4.2));

    }
}
