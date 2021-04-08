package com.happy.leetcode.array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        int left = 0;

        for(int right = 1;right< nums.length;right++){
            if (nums[left] == nums[right]){
                continue;
            }else {
                nums[++left] = nums[right];
            }
        }

        return left;
    }
}
