public class peak {
    public static void main(String[] args){
        int [] arr={10, 20, 15, 2, 23, 90, 67};
        int peakvalue=0;
        for(int i=1;i<arr.length;i++){
            if(i<arr.length){
                if( arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                     peakvalue=arr[i];
                }
            }
        }
        System.out.println(peakvalue);
    }
}
