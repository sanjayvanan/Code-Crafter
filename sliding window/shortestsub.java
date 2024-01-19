import java.util.*;
class shortestsub{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int[] arr={1,2,3,4,5,6,7,8};
        int tempmax=0,finalmax=Integer.MIN_VALUE;
        for (int i=0;i<a;i++){
            tempmax +=arr[i];
        }
        for(int i=a;i<arr.length;i++){
            tempmax=tempmax-arr[i-a]+arr[i];            
            finalmax=Math.max(tempmax,finalmax);
        }
        System.out.println("the maximun subarray is "+finalmax);
        s.close();
    }
}