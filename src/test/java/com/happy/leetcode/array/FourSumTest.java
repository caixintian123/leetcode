package com.happy.leetcode.array;

import lombok.val;
import net.minidev.json.JSONArray;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FourSumTest {

    @Test
    public void testFourSum(){
        int[] nums = new int[]{2,1,-4,3,2,-2,0};
        int target = 8;
        FourSum fourSum = new FourSum();
        val lists = fourSum.fourSum(nums, target);
        System.out.println(JSONArray.toJSONString(lists));
    }

}