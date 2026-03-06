public class stringsplit {
    void main() {
        String s = "laptop 100;mobile 21;tv 123",str="";
        String[] gap = s.split(";");
        int min=Integer.MAX_VALUE;

        for (String i : gap){
            String gaps[]=i.split(" ");
            if(min>Integer.parseInt(gaps[1])){
                min=Integer.parseInt(gaps[1]);
                str=gaps[0];
            }

        }
        System.out.println("min = " + min);
        System.out.println("str = " + str);
    }
}
