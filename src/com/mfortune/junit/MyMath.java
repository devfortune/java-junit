package com.mfortune.junit;

public class MyMath {
    public int calculateSum(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}
