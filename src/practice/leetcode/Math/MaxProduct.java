package practice.leetcode.Math;

import java.util.Arrays;

public class MaxProduct {
    public static int maximumProduct(int[] nums) {
        int size=nums.length;

        Arrays.sort(nums);
    return nums[size-1]*nums[size-2]*nums[size-3];
    }
    public static int factorial(int size) {
        if (size<=2)
            return 2;
        return factorial(size)*factorial(size-1);
    }
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1,2,3}));
        System.out.println(maximumProduct(new int[]{1,2,3,4}));
        System.out.println(maximumProduct(new int[]{-1,-2,-3}));
    }
}
