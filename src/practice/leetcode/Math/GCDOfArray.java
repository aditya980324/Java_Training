package practice.leetcode.Math;

public class GCDOfArray {
    public static int findGCD(int[] nums) {
        int smallest=nums[0],largest=nums[0];
        for (int i=0;i<nums.length;i++){
            if (smallest>nums[i])
                smallest=nums[i];
            if (largest<nums[i])
                largest=nums[i];
        }
        int j;
        for (j=smallest;j>=1;j--){
            if (smallest%j==0&&largest%j==0)
                break;
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{2,5,6,9,10}));
        System.out.println(findGCD(new int[]{7,5,6,8,3}));
        System.out.println(findGCD(new int[]{3,3}));
    }
}
