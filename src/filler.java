public class filler {
    static void main() {
        String s1 = "fi_er";
        String s2 = "fever;filer;flier;fries";
        String s1a[]=s1.split("_");
        String s2a[]=s2.split(";");
        String res="";
        for(String i:s2a){
            if(i.contains(s1a[0]) && i.contains(s1a[1])){
                int a= s1.indexOf("_");
                res=s1a[0]+Character.toUpperCase(i.charAt(a))+s1a[1];
            }
        }
        System.out.println("res = " + res);
    }
}
