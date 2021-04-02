package com.happt.leetcode.array;


   /*     给你一个包含 n 个整数的数组 nums，判断 nums中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
        注意：答案中不可以包含重复的三元组。
        示例：
        给定数组 nums = [-1, 0, 1, 2, -1, -4]，
        满足要求的三元组集合为：
        [
        [-1, 0, 1],
        [-1, -1, 2]
        ]
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class sum_15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        int len = nums.length -2  ;
        int index;
        int rearIndex ;
        List<List<Integer>> resultList = new ArrayList<>();



        for (int preIndex=0; preIndex <= len; preIndex++){

            if (nums[preIndex]>0) break;


            int target = -nums[preIndex];

            rearIndex = preIndex+1;
            index = nums.length -1;

            while (index > rearIndex){
                List<Integer> integers = new ArrayList<>();
                int x = nums[index] + nums[rearIndex];

                if (x == target){
                    integers.add(nums[preIndex]);
                    integers.add(nums[rearIndex]);
                    integers.add(nums[index]);
                    resultList.add(integers);
                    rearIndex++;
                    index--;
                    while (rearIndex < index && nums[rearIndex] == nums[rearIndex-1]){rearIndex++;}
                    while (rearIndex < index && nums[index] == nums[rearIndex+1]){index--;}

                }else if (x > target){
                    index--;
                }else if (x < target){
                    rearIndex++;
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] numArr = new int[]{0,0,0};
//        [-1,0,1,2,-1,-4]
        final List<List<Integer>> lists = threeSum(numArr);
        System.out.println(lists);
    }
}
