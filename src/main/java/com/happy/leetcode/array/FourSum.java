package com.happy.leetcode.array;

import net.minidev.json.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 16_四数之和
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(JSONArray.toJSONString(Collections.singletonList(nums)));
        int len = nums.length;

        if (nums.length < 4){return Collections.emptyList();}

//        两个特殊情况 最小的大于target 最大小于target
        if(nums[0]+nums[1]+nums[2]+nums[3] > target || nums[len-1]+nums[len-2]+nums[len-3]+nums[len-4] < target){ return Collections.emptyList();}
        List<List<Integer>> lists = new ArrayList<>();
        for (int i=0;i<len-3;i++){
            if (i>0 && nums[i] == nums[i-1]) continue;
            for (int second = i+1;second <len-2;second++){

                if (second > i+1 && nums[second] == nums[second-1]) continue;

                int left = second +1;
                int right = len-1;
                while (left<right){
                    List<Integer> childList = new ArrayList<>();
                    int sum = nums[i]+nums[second]+nums[left]+nums[right];
                    System.out.println("index:"+i+","+second+","+left+","+right+";"+"val："+nums[i]+","+nums[second]+","+nums[left]+","+nums[right]);
                    System.out.println("sum:"+sum);
                    if (sum == target){
                        childList.add(nums[i]);
                        childList.add(nums[second]);
                        childList.add(nums[left]);
                        childList.add(nums[right]);
                        System.out.println("插入数据:" + JSONArray.toJSONString(childList));
                        lists.add(childList);
                        while (left < right && nums[right] == nums[--right]);
                        while (left< right && nums[left] == nums[++left]);
                    }else if (sum > target){
                        right--;
                    }else {
                        left++;
                    }
                }
            }
        }
        return lists;
    }
}
