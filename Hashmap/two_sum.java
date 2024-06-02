package Hashmap;
import java.util.*;
class two_sum{
    public static void main(String[] args){
        int[] arr = {11,3,7,9,14,2};
        int target = 16;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int sec = target - arr[i];
            if(map.containsKey(sec)){
                ans[0] = map.get(sec);
                ans[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(ans[0]+" And "+ ans[1]);
    }
}

