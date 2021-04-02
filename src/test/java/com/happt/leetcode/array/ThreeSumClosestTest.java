package com.happt.leetcode.array;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ThreeSumClosestTest {

    @Test
    void testThreeSumClosest(){
        int[] nums = new int[]{-1,2,1,-4};
        int target =1;
        ThreeSumClosest_16 test = new ThreeSumClosest_16();
        final int i = test.threeSumClosest(nums, target);
        System.out.println("结果值："+ i);

    }
}
