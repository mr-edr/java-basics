public class rempal {
    static void main() {
        String str= "in india malayalam is good with mom and dad";
        String gap[] = str.split(" ");
        String result= "";
        for(String i : gap){
            String s = new StringBuilder(i).reverse().toString();
            if(!s.equals(i)){
                result= result+" "+i;
            }
        }
        System.out.println("result = " + result);
    }
}
