package practice.leetcode.Math;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum=(nums.length*(nums.length+1))/2,sum2=0;
        for (int i : nums)
            sum2=sum2+nums[i];
     return sum-sum2;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
