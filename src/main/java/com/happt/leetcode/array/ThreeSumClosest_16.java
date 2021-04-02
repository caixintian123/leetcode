package com.happt.leetcode.array;

import java.util.Arrays;

public class ThreeSumClosest_16 {

//    public static void main(String[] args) {
//        int[] nums = new int[]{-1,2,1,-4};
//        int target =1;
//        final int i = threeSumClosest(nums, target);
//        System.out.println("结果值："+ i);
//    }

        public int threeSumClosest(int[] nums, int target) {

            Arrays.sort(nums);
            int len = nums.length-1;
            int left,right;
            int maxVal = nums[len]+nums[len-1]+nums[len-2];
            int best = nums[0]+nums[1]+nums[2];
            if (best> target){ return best; }
            if (maxVal < target){ return maxVal; }

            for (int i=0;i<=len-2;i++){
                left = i+1;
                right = len;
                while (left<right){

                    int sum = (nums[i] + nums[left] + nums[right]);
                    if (Math.abs(sum - target)<Math.abs(best - target)){
                        best = sum;
                    }

                    if (sum>target){
                        right--;
                    }else {
                        left++;
                    }
                }

                if (best == target){
                    break;
                }
            }
            return best;
        }
}
