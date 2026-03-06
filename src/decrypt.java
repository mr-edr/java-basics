public class decrypt {
    static void main() {
        String s = "H9i2";
        StringBuilder res=new StringBuilder();
        for(int i = 0 ; i<s.length()-1 ; i+=2){
            for (int j = 0; j < s.charAt(i+1)-'0'; j++) {
                res.append(s.charAt(i));
            }
        }
        System.out.println("res = " + res);
    }
}
