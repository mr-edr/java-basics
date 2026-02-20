public class maxfrq {
    static void main(String[] args) {
        int arr[] = {1,2,4,1,6,2,6,3,4,4,5,6,7,4};

        int max=0,count=0;

        for(int i : arr){
            if(count==0){
                max=i;
                count++;
            }
            else if( i== max ){
                count++;
            }
            else {
                count -- ;
//                if(count ==0){
//                    max=i;
//                }

            }
        }
        System.out.println(count);
        System.out.println(max +" has the maximum frequencyy");
    }
}
