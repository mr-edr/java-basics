import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class array_1 {
   void main() {
//        int[] arr = {0,5,9};
//
//        int [] a = new int[10];
//
//        for(int i : arr ){
//            a[i]++;
//        }
//
//        System.out.println(Arrays.toString(a));

        Map <Integer , Integer > map = new HashMap<>();

        int arr1[] = {22,33,44,22,11,56,77};
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int maxfrq=0,element = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > maxfrq){
                maxfrq=entry.getValue();
                element=entry.getKey();
            }
        }

        System.out.println("Element with max frequency is : "+element);
    }
}
