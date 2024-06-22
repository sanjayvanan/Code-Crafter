
// 287. Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

import java.util.*;
public class duplicates {
    class Main {
        public int findDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int i =0;i<nums.length;i++){
                if(set.contains(nums[i])){
                    return nums[i];
                }
                set.add(nums[i]);
            }
            return -1;
        }
    }
}

