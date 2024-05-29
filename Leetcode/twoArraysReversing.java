import java.util.Arrays;

class Solution {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        if(Arrays.equals(target,arr)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int[] target = {1,2,3,4};
        int [] arr = {2,4,1,3};
        canBeEqual(target,arr);
        
     }
}

//1460 leetcode