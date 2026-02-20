public class vowelswap {
    public static void main(String[] args) {
        String s="Hello";
        int i=0;
        int j=s.length()-1;
        char t;
        String vowel="aeiouAEIOU";
        char[] str=s.toCharArray();
        while(i<j){
            if(vowel.indexOf(str[i])!=-1 && vowel.indexOf(str[j])!=-1){
                t=str[i];
                str[i]=str[j];
                str[j]=t;
                i++;
                j--;
            }
            else if(vowel.indexOf(str[i])!=-1)
                j--;
            else if(vowel.indexOf(str[j])!=-1)
                i++;
            else{
                i++;
                j--;
            }
        } 
        System.out.println(new String(str));
    }
}
