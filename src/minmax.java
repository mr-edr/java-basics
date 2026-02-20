public class minmax {
    static void main() {
        int[] arr = {45,67,76,69,96,68,99};

        int min = arr[0],max = arr[0];
        for(int i : arr){
            if(i<min) min=i;
            if(i>max) max= i;
        }
        System.out.println("minimum : "+min +" \nmaximum : "+ max);
    }
}
