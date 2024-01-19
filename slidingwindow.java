import java.util.*;
public class slidingwindow {
    public static void main(String[] args){
        int [] arr={50,9,31,-4,21,7,8,9};
        int cSum=0,mSum=Integer.MIN_VALUE,k=3;
        for(int i=0;i<k;i++){
            cSum+=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            cSum=cSum-arr[i-k]+arr[i];
            mSum=Math.max(mSum,cSum);

        }
        int fSum=arr[0]+arr[1]+arr[2];
        if(fSum>mSum){
            System.out.println(fSum);
        }
        else{
            System.out.println(mSum);
        }
        
    }
}



// import java.util.*;
// public class slidingwindow {
//     public static void main(String[] args){
//         int [] arr={10,9,31,-4,21,7,8,45};
//         int cSum=0,mSum=Integer.MIN_VALUE,k=3;

//         for(int i=0;i<k;i++){
//             cSum+=arr[i];
//         }
//         for(int i=k;i<arr.length;i++){
//             cSum=arr[i]-arr[i-k]+arr[i];
//             mSum=Math.max(cSum,mSum);
//         }
//         System.out.println(mSum);
        
//     }
// }
