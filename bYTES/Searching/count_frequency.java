import java.util.*;
class count_frequency{
    public static void main(String[]args){
        int[] arr = {10,10,10,20,20,30,30,30,30,40};
        int count = 1;  
        int j=1,i=0;
        Arrays.sort(arr);
        while(j<arr.length){
            if(arr[i]== arr[j]){
                count +=1;
                j++;
            }
            else{
                System.out.println("Element "+arr[i]+" occurs "+count+" times");
                count = 1;
                i = j;
                j = i+1;
            } 
        }
        System.out.println("Element " + arr[i] + " occurs " + count + " times");
    }
}

//time complexity of - O(n logn);
//space - O(1);

