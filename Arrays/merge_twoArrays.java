package Arrays;
import java.util.*;
public class merge_twoArrays {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] merge_twoArray = new int[arr1.length+arr2.length] ;
        //{0,0,0,0,0,0,0,0,0}
    
        
        for(int i=0;i<arr1.length;i++){
            merge_twoArray[i] = arr1[i];
        }
        
        for(int i=0;i<arr2.length;i++){
            merge_twoArray[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(merge_twoArray));
        
    }
}
