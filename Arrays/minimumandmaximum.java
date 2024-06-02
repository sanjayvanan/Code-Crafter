package Arrays;

public class minimumandmaximum {
   public static void main(String[] args){
    int[] arr = {1,5,3,4,6,9,3};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
         max = Math.max(max, arr[i]);
         min = Math.min(min,arr[i]);
    }
    System.out.println("Minimum is "+min+" arr max = "+ max); 
   }
     

}
