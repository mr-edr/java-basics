import java.util.Arrays;

public class maxfreq{
    static void main() {
        String s = "engineering";
        int max=0,i=0,min=Integer.MAX_VALUE;
        char maxchar='\0',minchar='\0';
        int alp[]= new int [26];
        while(i<s.length()){
            int pos=s.charAt(i)-'a';
            alp[pos]++;
            if(alp[pos]>max){
                max=alp[pos];
                maxchar=s.charAt(i);
            }

            i++;
        }
        if(max>1){
            System.out.println("max = " + max);
            System.out.println("maxchar = " + maxchar);
        }
        else{
            System.out.println(-1);
        }
        for(int j=0;j<26;j++){
            if(alp[j]!=0 && alp[j]<min){
                min=alp[j];
                minchar=(char)(j+'a');
            }
        }
        System.out.println("min = " + min);
        System.out.println("minchar = " + minchar);


    }
}