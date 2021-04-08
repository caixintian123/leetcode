package com.happy.leetcode.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicatesTest(){
        int[] nums = new int[]{1,1,2};
        final int i = new RemoveDuplicates().removeDuplicates(nums);
        System.out.println("结果值："+ i);
        Assert.assertNotEquals(i,2);
    }


}
